class Solution {
    private final int mod=10_00_00_0007;
    public int solve(int n,int num,int x,int [][] dp){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        
        int currPowerValue=(int)Math.pow(num,x);
        if(currPowerValue>n){
            return 0;
        }
        if(dp[n][num]!=-1){
            return dp[n][num];
        }
        int take=solve(n-currPowerValue,num+1,x,dp);
        int skip=solve(n,num+1,x,dp);

        return dp[n][num]= (take+skip)%mod;
    }
    public int numberOfWays(int n, int x) {
        int [][] dp=new int[n+1][n+1];
        for(int [] row :dp){
        Arrays.fill(row,-1);
        }
        return solve(n,1,x,dp);
    }
}