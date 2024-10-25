class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
           for(int i=n-1;i>=0;i--){
            if(digits[i]==9){
                digits[i]=0; //[9] ==>first [0] then create one more length below [1,0];
            }
            else{
                digits[i]++; //one time addition
                return digits;
            }
           }
           digits=new int[digits.length+1];
           digits[0]=1;
           return digits;

    /*for(int i=digits.length-1;i>=0;i--){
        if(digits[i]==9){
            digits[i]=0; //setting as 0 after this loop increase size and add arr[0];
        }
        else{
            digits[i]++; //one time addition 
            return digits;
        }
    }
    digits=new int[digits.length+1]; //0 , 0, 0 ,0=>for 9,9 ,9
    digits[0]=1;
    return digits;*/
    }
}