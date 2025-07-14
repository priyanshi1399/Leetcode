class Solution {
    public boolean solve(int index,int n,int [] nums,int [] dp){
        if(index>=n-1){
            return true;
        }
        if(dp[index]!=-1){
            return dp[index]==0;
        }

        for(int i=1;i<=nums[index];i++){
            if(solve(index+i,n,nums,dp)==true){
                 dp[index]=0;
                return true;
            }
        }
        dp[index]=1;
        return false;

    }
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int [] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return solve(0,n,nums,dp);
    }
}