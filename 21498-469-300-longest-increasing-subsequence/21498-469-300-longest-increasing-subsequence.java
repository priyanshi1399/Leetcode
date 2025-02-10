class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int [] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=1;

        for(int i=0;i<nums.length;i++){
            ans=Math.max(ans,helper(nums,i,dp));
        }
        return ans;
    }
    public int helper(int [] nums, int index,int [] dp){
        if(dp[index]!=-1){
            return dp[index];
        }
        if(index==0){
            return 1;
        }

        int res=1;
        for(int i=0;i<index;i++){
            if(nums[i]<nums[index]){
            res=Math.max(res,helper(nums,i,dp)+1);
            }
        }
        dp[index]=res;
        return dp[index];
    }

}