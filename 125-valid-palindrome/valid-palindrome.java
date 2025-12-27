class Solution {
    public boolean isPalindrome(String s) {
        String newString=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder str=new StringBuilder(newString);
        String reverse=str.reverse().toString();
        for(int i=0;i<newString.length();i++){
            if(newString.charAt(i)!=reverse.charAt(i)){
                return false;
            }
        }
        return true;



    }
}