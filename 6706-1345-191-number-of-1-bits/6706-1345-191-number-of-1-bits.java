class Solution {
    public int hammingWeight(int n) {
        int count=0;
        for(int bitIndex=0;bitIndex<32;bitIndex++){
            if((n & (1<<bitIndex))!=0){
                count++;
            }
        }
        return count;
    }
}