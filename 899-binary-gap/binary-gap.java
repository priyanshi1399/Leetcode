class Solution {
    public int binaryGap(int n) {
        //there can be max 20 bits 2^10~1024 ->(10^3 )^3 ->(2^10)^3
        int currBit=0;
        int prevBit=-1;
        int maxDist=0;
        while(n>0){
            if((n&1)>0){
                
                maxDist=prevBit!=-1?Math.max(maxDist,currBit-prevBit):maxDist;
                prevBit=currBit;
            }
            currBit++;
            n=n>>1; //0 will be appended 0 leftside 
        }
        return maxDist;
    }
}