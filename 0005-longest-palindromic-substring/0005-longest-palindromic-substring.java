class Solution {

    private String expand(String s, int left,int right){
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);      
         
    }
    public String longestPalindrome(String s) {
        /* bababa  same -
        babad
        cbbd
        */

        if(s.length()<=1){
            return s;
        }
        String maxSubstring=s.substring(0,1);
        for(int i=0;i<s.length()-1;i++){
            String odd=expand(s,i,i);
            String even=expand(s,i,i+1);
            if(odd.length()>maxSubstring.length()){
                maxSubstring=odd;
            }
             if(even.length()>maxSubstring.length()){
                maxSubstring=even;
            }

        }

    
    return maxSubstring;
}
}