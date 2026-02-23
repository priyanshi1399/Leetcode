class Solution {
    public int binaryGap(int n) {
        //there can be max 20 bits 2^10~1024 ->(10^3 )^3 ->(2^10)^3
        int prevBit=-1;
        int maxDist=0;
        for(int curr=0;curr<32;curr++){
            if((1 & (n>>curr))>0){
                maxDist=prevBit!=-1?Math.max(maxDist,curr-prevBit):maxDist;
                prevBit=curr;
            }
        }
        return maxDist;
    }
}