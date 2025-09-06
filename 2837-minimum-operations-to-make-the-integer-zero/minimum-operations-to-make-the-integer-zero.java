class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for(int t=1;t<=36;t++){ //computed from min value of num1 and max of num2 range
            long val=(long)num1-t*(long)num2;
            if(val<0){
                break;
            }
            if(Long.bitCount(val)<=t && t<=val) { //range is calculated by formula 2 powers of t 
                    return t;
            }
        }
        return -1;       
       /* int t=1;
        while(true){
            long val=(long)num1-t*(long)num2;
            if(val<0){
                return -1;
            }
            if(Long.bitCount(val)<=t && t<=val) { //range is calculated by formula 2 powers of t 
                    return t;
            }
            t++;
        }*/
       
    }
}