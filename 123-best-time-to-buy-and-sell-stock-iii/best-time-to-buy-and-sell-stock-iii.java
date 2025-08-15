class Solution {
    int maxProfit=0;
    int n;
    public int func(int idx,int buy,int [] prices,int maxProfit,int cap,int [][][] dp){
        
        if(idx==n){
            return 0;
        }
        
        if(cap==2){
            return 0;
        }
        if(dp[idx][buy][cap]!=-1){
            return dp[idx][buy][cap];
        }
        if(buy==1){
            maxProfit=Math.max(-prices[idx]+func(idx+1,0,prices,maxProfit,cap,dp),func(idx+1,1,prices,maxProfit,cap,dp));

        }
        else{
             maxProfit=Math.max(+prices[idx]+func(idx+1,1,prices,maxProfit,cap+1,dp),func(idx+1,0,prices,maxProfit,cap,dp));
        }
        return dp[idx][buy][cap]=maxProfit;
    }
    public int maxProfit(int[] prices) {
        maxProfit=0;
        n=prices.length;
        int [][][] dp=new int[n+1][2][2];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                for(int k=0;k<dp[i][j].length;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        return func(0,1,prices,maxProfit,0,dp);

    }
}