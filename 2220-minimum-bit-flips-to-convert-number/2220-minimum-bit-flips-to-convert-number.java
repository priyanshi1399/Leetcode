class Solution {
    public int minBitFlips(int start, int goal) {
        int xor=start^goal;
        int ans=0;
        while(xor!=0){

            ans+=xor & 1; //check if last bit is 1

            xor=xor>>1;//right shift 
        }
        return ans;
    }
}