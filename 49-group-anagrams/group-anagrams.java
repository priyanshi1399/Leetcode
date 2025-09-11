class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String word:strs){ //traversing to the every String in strs array
            String sortedString=SortTheString(word);
            if(!map.containsKey(sortedString)){
                //if its not in the list of keys
                map.put(sortedString,new ArrayList<>());
            }
            //if exists then it will get the key and add the word to it
            map.get(sortedString).add(word);
        }
        return new ArrayList<>(map.values());
    }
    private String SortTheString(String str){
        char [] charArray=str.toCharArray(); //convert to charArray
        Arrays.sort(charArray);
        return new String(charArray); //returning String after sorting it
    }
}