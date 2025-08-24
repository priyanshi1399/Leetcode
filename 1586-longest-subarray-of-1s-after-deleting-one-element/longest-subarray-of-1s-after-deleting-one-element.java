class Solution {
    public int longestSubarray(int[] nums) {
        int zeroes=0;
        int n=nums.length;
        int maxLength=0;
        int left=0;
        for(int right=0;right<n;right++){
            if(nums[right]==0){
                zeroes++;
            }

            if(zeroes<2){
                maxLength=Math.max(maxLength,right-left+1);
            }
            if(zeroes>1){
                if(nums[left]==0){
                    zeroes--;
                }
                left++; //keep fixing zeroes till 1 only bcz we have to delete 1 element
            }

        }
        return maxLength-1;
    }
}