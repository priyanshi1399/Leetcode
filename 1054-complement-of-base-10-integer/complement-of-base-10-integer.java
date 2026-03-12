class Solution {
    public int bitwiseComplement(int n) {
        int result=n;
        if(n==0){
            return 1;
        }
       for(int bitIndex=0;(1<<bitIndex)<=n;bitIndex++){
           result=result ^ (1<<bitIndex);
       }
       return result;
        


    }
}