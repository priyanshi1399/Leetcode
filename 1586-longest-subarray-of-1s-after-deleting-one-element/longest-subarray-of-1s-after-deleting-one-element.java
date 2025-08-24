class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int maxLength=0;
        for(int i=0;i<n;i++){
            int zeroes=0;
            for(int j=i;j<n;j++){
                if(nums[j]==0){
                    zeroes++;
                }
                if(zeroes>1){
                    break;
                }
                maxLength=Math.max(maxLength,j-i+1);
            }
            
        }
        return maxLength-1;
    }
}