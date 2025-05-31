class Solution {
    class Pair<K,V>{
        K key;
        V value;

        Pair(K key,V value){
            this.key=key;
            this.value=value;
        }

        public K getKey(){
            return key;
        }
        public V getValue(){
            return value;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set=new HashSet<>(wordList);
        Queue<Pair<String,Integer>> q=new LinkedList<>();
        q.add(new Pair(beginWord,1));
        if(set.contains(beginWord)){
            set.remove(beginWord);
        }
        while(!q.isEmpty()){
            Pair<String,Integer> p=q.poll();
            String word=p.getKey();
            int step=p.getValue();
            if(word.equals(endWord)){
                return step;
            }
            for(int i=0;i<word.length();i++){
                char ch1=word.charAt(i);
                for(char ch='a';ch<='z';ch++){
                    char [] replaceArray=word.toCharArray();
                    replaceArray[i]=ch;
                    String replace=new String(replaceArray);
                    if(set.contains(replace)){
                        set.remove(replace);
                        q.add(new Pair(replace,step+1));
                    }


                }
            }
        }
        return 0;
    }
}