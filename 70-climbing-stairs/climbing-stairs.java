class Solution {
    public int climbStairs(int n) {
        int [] dp=new int[n+1];
        Arrays.fill(dp,-1);
        if(n<=3){
            return n;
        }

        return solve(n,dp);
    }

    public int solve(int n,int [] dp){
        if(n<=3){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=solve(n-1,dp)+solve(n-2,dp);
    }
}
