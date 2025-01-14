class Solution {

    public  String appendAfterCounting(String str){
        int [] arr=new int[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
            builder.append(String.valueOf((char)(i+'a')).repeat(arr[i]));
            }
        }
        return builder.toString();       

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s: strs){
        String newString= appendAfterCounting(s);

        if(!map.containsKey(newString)){
            map.put(newString,new ArrayList<>());
        }
        map.get(newString).add(s);
        }

        return new ArrayList<>(map.values());
    }
}



    /*public String letterConcatenate(int frequency, char ch){
        String appended="";
        for(int i=0;i<frequency;i++){
            appended=appended+ch;
        }
        return appended;
    }

    public  String appendAfterCounting(String str){
        int [] arr=new int[26];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
            String appended= letterConcatenate(arr[i],(char)(i+'a'));
            builder.append(appended);
            }
        }
        return builder.toString();       

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s: strs){
        String newString= appendAfterCounting(s);

        if(!map.containsKey(newString)){
            map.put(newString,new ArrayList<>());
        }
        map.get(newString).add(s);
        }

        return new ArrayList<>(map.values());
    }
}*/