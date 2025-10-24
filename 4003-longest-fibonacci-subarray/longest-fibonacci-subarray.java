class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        if(n<3){
            return 0;
        }
        int maxLength=0;
        int length=2;
        for(int i=2;i<n;i++){
            if(nums[i-1]+nums[i-2]==nums[i]){
                length++;
            }
            else{
                length=2;
            }
            maxLength=Math.max(maxLength,length);
        }
        return maxLength;
    }
}