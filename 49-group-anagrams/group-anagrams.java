class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String word:strs){ //traversing to the every String in strs array
            String sortedString=getSortedString(word);
            map.putIfAbsent(sortedString,new ArrayList<>());//it creates new ArrayList if not present
            //if present then it will not create new ArrayList
            map.get(sortedString).add(word);
        }
        return new ArrayList<>(map.values());
    }
    private String getSortedString(String str){
        int [] count=new int[26];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)-'a']++;
        }
        StringBuilder combined=new StringBuilder();
        for(int i=0;i<26;i++){
            if(count[i]>0){
                int num=count[i]; //denotes the num values how many times character got repeated
                combined.append(String.valueOf((char)(i+'a')).repeat(num));
            }
        }
        return combined.toString();
    }
}