class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]++;
                break;
            }
            else{
                digits[i]=0;
            }
        }
        if(digits[0]==0){
            int [] res=new int[digits.length+1];
            res[0]=1;
            return res;
        }
        return digits;

/*
89->80->90
1899->1890-->1800-->1900
99-->90->00->if first bit is 0-.increasing size of array
*/
       /* int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            else if(digits[i]==9){
                digits[i]=0;
            }
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;*/
    }
}
//123-->124
//199-->200
//999->1000 this is the special case where you have to create new array