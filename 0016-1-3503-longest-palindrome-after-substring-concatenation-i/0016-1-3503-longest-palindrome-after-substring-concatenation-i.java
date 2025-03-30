class Solution {
    private boolean isPalindrome(String str){
        StringBuilder builder=new StringBuilder(str);
        builder.reverse();
        if(str.equals(builder.toString())){
            return true;
        }
        return false;
    }
    private List<String> generateSubstring(String str){
        List<String> res=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                res.add(str.substring(i,j+1));
            }
        }
        res.add(""); //addimng empty String as mentioned
        return res;
    }
    public int longestPalindrome(String s, String t) {
        int maxLength=1;
        List<String> sSubs=generateSubstring(s);
        List<String> tSubs=generateSubstring(t);
        for(int i=0;i<sSubs.size();i++){
            System.out.println(sSubs.get(i));
        }
        for(int i=0;i<tSubs.size();i++){
            System.out.println(tSubs.get(i));
        }
        for(String s1: sSubs){
            for(String s2:tSubs){
                if(isPalindrome(s1+s2)){
                    maxLength=Math.max(maxLength,(s1+s2).length());
                }
            }
        }
        return maxLength;

    }
}