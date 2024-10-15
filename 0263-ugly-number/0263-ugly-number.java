class Solution {
    public boolean isUgly(int n) {
        /* combine in this form 2^2*3^3^*7==>2^1*3^2*7->2^0*3^1*7->1*3^0*7-->1*1*7==>7 * left 7 then ugly*/
        /* 6=2^1*3^1-->2^0*3^0->1*1==>1-->ugly*/
        while(n<=0){
            return false;
        }
        while(n%2==0){
            n=n/2;
        }
        while(n%3==0){
            n=n/3;
        }
        while(n%5==0){
            n=n/5;
        }
        return n==1;
    }
}