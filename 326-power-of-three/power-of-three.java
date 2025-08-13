class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==0){
            return false;
        }
        int rem=0;
        while(n!=1){
           rem=n%3;
           n=n/3;
           if(rem%3!=0){
            return false;
           }        
        }

        return true;
    }
} 