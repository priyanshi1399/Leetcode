class Solution {
    class Pair<K,V>{
        private final K key;
        private final V value;

        public Pair(K key,V value){
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
        Set<String> wordSet=new HashSet<>();
        for(String s:wordList){
            wordSet.add(s);
        }
        Queue<Pair<String,Integer>> q=new LinkedList<>();
        q.add(new Pair<>(beginWord,1));

        while(!q.isEmpty()){
            Pair<String,Integer> p=q.poll(); //hit
            String word=p.getKey();
            int step=p.getValue();
            if(word.equals(endWord)){
                return step;
            }
            for(int i=0;i<word.length();i++){
                char [] replaceArray=word.toCharArray();
                for(char ch='a';ch<='z';ch++){
                    replaceArray[i]=ch; //hit-->ait,bit,cit....zit
                    String replace=new String(replaceArray); //convert charArray to String
                    if(wordSet.contains(replace)){
                        wordSet.remove(replace);
                        q.add(new Pair<>(replace,step+1));
                    }
                }
            }
        }
        return 0;
    }
}