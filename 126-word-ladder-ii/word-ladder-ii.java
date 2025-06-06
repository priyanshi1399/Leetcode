class Solution {
    List<List<String>> result=new ArrayList<>();
    HashMap<String,Integer> mapLevel=new HashMap<>();
    String begin;
    //start polling out the string from then check in Map for levels

    public void dfs(List<String> sequence, String endWord){
        if(endWord.equals(begin)){
            List<String> validPath=new ArrayList<>(sequence);
            Collections.reverse(validPath);
            result.add(validPath);
            return;
        }

        int steps=mapLevel.get(endWord);
        String word=endWord;

        for(int i=0;i<word.length();i++){
            char [] charArray =word.toCharArray();
            for(char ch='a';ch<='z';ch++){
                charArray[i]=ch;
                String replace=new String(charArray);
                if(mapLevel.containsKey(replace) && mapLevel.get(replace)+1==steps){
                    sequence.add(replace);
                    dfs(sequence,replace);
                    sequence.remove(sequence.get(sequence.size()-1));
                }
            }
        }

    }
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        begin=beginWord;
        Set<String> wordSet=new HashSet<>();
        for(int i=0;i<wordList.size();i++){
            wordSet.add(wordList.get(i)); //insering word to Map
        }
        Queue<String> q=new LinkedList<>();
        q.add(beginWord); //add beginWord to Queue
        wordSet.remove(beginWord);
        mapLevel.put(beginWord,1);
        while(!q.isEmpty()){
            String word=q.poll();//polling to word
            int steps=mapLevel.get(word);

            if(word.equals(endWord)){
                break;
            }
            for(int i=0;i<word.length();i++){
                char [] charArray=word.toCharArray(); 
                for(char ch='a';ch<='z';ch++){
                    charArray[i]=ch;
                    String replace=new String(charArray);
                    if(wordSet.contains(replace)){
                        q.add(replace);
                        mapLevel.put(replace,steps+1);
                        wordSet.remove(replace);
                        
                    }
                }
            }
        }

        if(mapLevel.containsKey(endWord)){
            List<String> sequence=new ArrayList<>();
            sequence.add(endWord);
            dfs(sequence,endWord);
        }

        return result;
    }
}