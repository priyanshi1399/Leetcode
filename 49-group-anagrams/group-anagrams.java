class Solution {
    public String sorted(String str){
        char [] charArray=str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
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