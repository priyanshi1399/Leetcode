class Solution {
    public int alternateDigitSum(int n) {
        String number=String.valueOf(n);
        int sum=0;
        for(int i=0;i<number.length();i++){
             char ch=number.charAt(i);
            if(i%2==0){
               
                sum+=ch-'0';
            }
            else{
                sum+=(-1)*(ch-'0');
            }
        }
        return sum;
    }
}