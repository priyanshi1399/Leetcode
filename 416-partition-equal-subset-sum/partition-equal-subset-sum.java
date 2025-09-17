class Solution {
    public boolean solve(int idx,int target,int [] nums,int n,Boolean [][] dp){
        if(idx>=n || target<0){
            return false;
        }
        if(target==0){
            return true;
        }
        if(dp[idx][target]!=null){
            return dp[idx][target];
        }
        boolean include=solve(idx+1,target-nums[idx],nums,n,dp);
        boolean exclude=solve(idx+1,target,nums,n,dp);
        dp[idx][target]=include | exclude;
        return include | exclude;

    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int target=sum/2;
        Boolean [][] dp=new Boolean[n][target+1];

        
        if(sum%2!=0){
            return false;
        }

        return solve(0,target,nums,n,dp);
    }
}