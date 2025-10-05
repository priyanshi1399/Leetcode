class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int XOR=0;
        int zerocount=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                zerocount++;
            }
            XOR=XOR^nums[i];
        }

        if(XOR!=0){
            return n;
        }
        else if(zerocount==n){
            return 0;
        }
        return n-1;
    }
}