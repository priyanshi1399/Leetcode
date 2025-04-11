class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int zeroes=0;
        int maxLength=0;
        for(int right=0;right<n;right++){
            if(nums[right]==0){
                zeroes++;
            }

            if(zeroes<=k){
                    maxLength=Math.max(maxLength,right-left+1);
                
            }

            while(zeroes>k){
                if(nums[left]==0){
                    zeroes--;
                }
                left++;
            }
        }
        return maxLength;
    }
}