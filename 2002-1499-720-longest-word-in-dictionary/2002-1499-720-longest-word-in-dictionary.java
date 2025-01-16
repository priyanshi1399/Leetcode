class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        HashSet<String> set=new HashSet<>();
        String ans="";
        for(int i=0;i<words.length;i++){
            String s=words[i];
            if(s.length()==1 || set.contains(s.substring(0,s.length()-1))){
                if(s.length()>ans.length()){
                    ans=s;
                }
            set.add(s);    
            }
            
        }
        return ans;
    }
}