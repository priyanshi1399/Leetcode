class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int zeroes=0;
        int start=0;
        int maxLength=0;
        for(int end=0;end<n;end++){
            if(nums[end]==0){
                zeroes++;
            }

            if(zeroes>k){
                if(nums[start]==0){
                    zeroes--;
                }
                start++;
            }

            maxLength=Math.max(maxLength,end-start+1);
        }
        return maxLength;

    }
}