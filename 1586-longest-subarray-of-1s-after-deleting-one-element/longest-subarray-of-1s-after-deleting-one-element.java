class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int maxLength=0;
        int last_zero_index=-1;
        int left=0;
        for(int right=0;right<n;right++){

            if(nums[right]==0){
                left=last_zero_index+1; //shift our left to where last zero seen+1
                last_zero_index=right; //update last zero index seen
            }
            maxLength=Math.max(maxLength,right-left);
        }
        return maxLength;
    }
}