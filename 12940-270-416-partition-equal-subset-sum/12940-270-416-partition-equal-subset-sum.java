class Solution {
    public boolean solve(int idx,int [] nums,int target,int n,int [][] dp){
        if(idx>=n || target<0){
            return false;
        }

        if(target==0){
            return true;
        }
        if(dp[idx][target]!=-1){
            return dp[idx][target]==1;
        }
        boolean take=solve(idx+1,nums,target-nums[idx],n,dp);
        boolean  not_take=solve(idx+1,nums,target,n,dp);
        dp[idx][target]=(take | not_take)?1:0;
        return take | not_take;
        
    }
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        int [][] dp=new int[n+1][200001];
        for(int [] row :dp){
            Arrays.fill(row,-1);
        }
        if(total%2!=0){
            return false;
        }

        int target=total/2;
        return solve(0,nums,target,n,dp);
    }
}