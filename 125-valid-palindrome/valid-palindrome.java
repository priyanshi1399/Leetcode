class Solution {
    public boolean isPalindrome(String s) {
        String newString=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder str=new StringBuilder(newString);
        String reverse=str.reverse().toString();  
        return newString.equals(reverse);




    }
}