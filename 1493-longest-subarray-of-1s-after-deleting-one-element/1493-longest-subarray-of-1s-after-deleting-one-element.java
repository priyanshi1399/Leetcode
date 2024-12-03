class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int zeroes=0;
        int answer=0;

        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                zeroes++;
            }
            if(zeroes<2){
                answer=Math.max(answer,right-left+1);
            }
            while(zeroes>1){
                if(nums[left]==0){
                    zeroes--;
                }
                left++;   //making window feasible by making zeroes=1
            }
        }
        return answer-1; //returning after deleting one element not the window size
    }
}