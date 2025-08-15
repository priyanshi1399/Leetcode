class Solution {
    int maxProfit=0;
    public int func(int idx, int buy,int maxProfit,int [] prices,int n,int [][] dp){
        if(idx>=n){
            return 0;
        }
        if(dp[idx][buy]!=-1){
            return dp[idx][buy];
        }

        if(buy==1){
            maxProfit=Math.max(-prices[idx]+func(idx+1,0,maxProfit,prices,n,dp),func(idx+1,1,maxProfit,prices,n,dp));

        }
        else{
            maxProfit=Math.max(+prices[idx]+func(idx+2,1,maxProfit,prices,n,dp),func(idx+1,0,maxProfit,prices,n,dp));

        }
        return dp[idx][buy]=maxProfit;
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int [][] dp=new int[n+1][n+1];
        for(int [] row:dp){
            Arrays.fill(row,-1);
        }
        maxProfit=0;
        return func(0,1,maxProfit,prices,n,dp);
    }
}