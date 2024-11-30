class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maximumSumEndingHere=nums[0];
        int answer=nums[0];
        for(int i=1;i<n;i++){
                maximumSumEndingHere=Math.max(maximumSumEndingHere+nums[i],nums[i]);
                answer=Math.max(maximumSumEndingHere,answer);
        }
        return answer;
        



       /*  int maxi = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i=0;i<nums.length; i++)
        {
            sum =sum+  nums[i];

            if (sum > maxi)
            {
                maxi = sum;
            }

            if (sum < 0)
            {
                sum = 0;
            }
            
        }
        return maxi;*/
    }
}