class Solution {
    public int solve(int i,int [] costs,int n,int [] dp){
        if(i>n){
            return Integer.MAX_VALUE;
        }
        if(i==n){//reached top
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int oneStep=(costs[i]+1)+solve(i+1,costs,n,dp);
        int twoStep=i+2<=n?(costs[i+1]+4)+solve(i+2,costs,n,dp):Integer.MAX_VALUE;
        int threeStep=i+3<=n?(costs[i+2]+9)+solve(i+3,costs,n,dp):Integer.MAX_VALUE;

        return dp[i]=Math.min(oneStep,Math.min(twoStep,threeStep));
    }
    public int climbStairs(int n, int[] costs) {
      int [] dp=new int[n+1];
      Arrays.fill(dp,-1);
      return solve(0,costs,n,dp);
}
}