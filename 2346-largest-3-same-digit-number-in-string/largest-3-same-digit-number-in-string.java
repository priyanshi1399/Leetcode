class Solution {
    public String largestGoodInteger(String num) {
        char maxChar=' ';
        int n=num.length();
        for(int i=2;i<n;i++){
            if(num.charAt(i)==num.charAt(i-1) & num.charAt(i)==num.charAt(i-2)){
                maxChar=(char)Math.max(maxChar,num.charAt(i));
            }
        }

        return maxChar==' '?"":String.valueOf(maxChar).repeat(3);
    }
}