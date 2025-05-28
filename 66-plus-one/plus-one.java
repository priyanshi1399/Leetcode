class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        int n=digits.length;
        for(int i=n-1;i>=0;i--){
            if(digits[i]==9 && carry==0){
                digits[i]=0;
                carry++;
            }
            else if(digits[i]<9 && carry==0){
                digits[i]++;
                break;
            }
            else if(digits[i]==9 && carry==1){
                digits[i]=0;
            }
            else if(digits[i]<9 && carry==1){
               digits[i]++;
               break;
            }

        }

        if(digits[0]==0 && carry==1){
            int [] res=new int[n+1];
            res[0]=1;
            return res;
        }
        return digits;
        
    }
}