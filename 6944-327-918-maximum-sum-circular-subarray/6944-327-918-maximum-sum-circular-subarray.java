class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int maxSum=nums[0];
        int minSum=nums[0];
        int tempMax=0;
        int tempMin=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            tempMax=Math.max(tempMax+nums[i],nums[i]);
            maxSum=Math.max(maxSum,tempMax);

            tempMin=Math.min(tempMin+nums[i],nums[i]);
            minSum=Math.min(minSum,tempMin);

        }
       return maxSum>0?Math.max(maxSum,sum-minSum):maxSum;
    }
}