class Solution {
    public int hammingWeight(int n) {
        int count_ith=0;
        for(int bitIndex=0;bitIndex<32;bitIndex++){
            if((n & (1<<bitIndex))!=0){
                count_ith++;
            }
        }
        return count_ith;
        
    }
}