class Solution {
    public boolean isBalanced(String num) {
        int sumAtEven=0;
        int sumAtOdd=0;
        int n=num.length();
        for(int i=0;i<n;i++){
            if(i%2==0){
                sumAtEven=sumAtEven+num.charAt(i)-'0';
            }
            else if(i%2!=0){
                sumAtOdd=sumAtOdd+num.charAt(i)-'0';
            }
        }
        return (sumAtEven==sumAtOdd);
    }
}