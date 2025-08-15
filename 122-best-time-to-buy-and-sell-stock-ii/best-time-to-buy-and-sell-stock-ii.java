class Solution {
    int maxProfit=0;
    int n;
    public int func(int idx,int buy,int [] prices,int maxProfit,int [][] dp){
        if(idx==n){
            return 0;
        }
        if(dp[idx][buy]!=-1){
            return dp[idx][buy];
        }

        if(buy==1){
            maxProfit=Math.max(-prices[idx]+func(idx+1,0,prices,maxProfit,dp),func(idx+1,1,prices,maxProfit,dp));
        }
        else{
             maxProfit=Math.max(+prices[idx]+func(idx+1,1,prices,maxProfit,dp),func(idx+1,0,prices,maxProfit,dp));
        }
        return dp[idx][buy]=maxProfit;
    }
    public int maxProfit(int[] prices) {
        maxProfit=0;
        n=prices.length;
        int [][] dp=new int[n+1][2];
        for(int [] row:dp){
            Arrays.fill(row,-1);
        }
        return func(0,1,prices,maxProfit,dp);
    }
}