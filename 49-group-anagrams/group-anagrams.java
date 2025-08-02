class Solution {
    public String sorted(String str){
       int [] indexArray=new int[26];
       for(int i=0;i<str.length();i++){
        indexArray[str.charAt(i)-'a']++;
       }

       //combining those character by index it will be in sorted Array
       StringBuilder sortedString=new StringBuilder();
       for(int i=0;i<26;i++){
        if(indexArray[i]!=0){
            int num=indexArray[i];
            sortedString.append(String.valueOf((char)(i+'a')).repeat(indexArray[i]));
       }
    }
    return sortedString.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String sortedStr=sorted(strs[i]);
            if(!map.containsKey(sortedStr)){
                 map.put(sortedStr,new ArrayList<>());
            }
            map.get(sortedStr).add(strs[i]);

        }

        List<List<String>> res=new ArrayList<>();
        for(Map.Entry<String,List<String>> entry:map.entrySet()){
            res.add(entry.getValue());
        }
        return res;
    }
}