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
            maxProfit=Math.max(-prices[idx]+func(idx+1,0,maxProfit,prices,n,dp),func(idx+1,1,maxProfit,prices,n,dp)); //here if we are buying then 0 means we can not buy again and if we are  not buying then 1 means we can buy again

        }
        else{
            maxProfit=Math.max(+prices[idx]+func(idx+2,1,maxProfit,prices,n,dp),func(idx+1,0,maxProfit,prices,n,dp)); //here we are seeling the stocks and moving to idx+2 due to cooldown and when moving to idx+1 still not selling and can not buy it due to cooldown 

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