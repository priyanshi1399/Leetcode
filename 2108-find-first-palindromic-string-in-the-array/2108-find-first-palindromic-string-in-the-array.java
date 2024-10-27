class Solution {

    public boolean isPalindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end){
        if(s.charAt(start)!=s.charAt(end)){
            return false;
        }
        start++;
        end--;
    }
    return true;
    }

     public String firstPalindrome(String[] words){
        int n=words.length;
        for(int i=0;i<n;i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    

   /* public String reverseString(String s){
        char [] ch=s.toCharArray();
        int start=0;
        int end=ch.length-1;
        while(start<end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        return new String(ch);
    }

    public String firstPalindrome(String[] words) {
        int n=words.length;
        for(int i=0;i<n;i++){
        String newStr=reverseString(words[i]);
        if(newStr.equals(words[i])){
            return words[i];
        }
        }
        return "";*/
    }
}