class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        int t=1;
        while(true){
            long val=(long)num1-t*(long)num2;
            if(val<0){
                return -1;
            }
            if(Long.bitCount(val)<=t && t<=val) { //range is calculated by formula 2 powers of t 
                    return t;
            }
            t++;
        }
       
    }
}