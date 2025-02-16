class Solution {

    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==0){
            return 0;
        }
        int [][] dp=new int[n][2]; // 2 for 0 and 1 
        for(int [] row: dp){
            Arrays.fill(row,-1);
        }
        int ans=helper(0,0,n,prices,dp);
        return ans;
    }

    public int helper(int index,int buy, int n,int [] prices,int [][] dp){
        if(index==n){
            return 0;
        }
        if(dp[index][buy]!=-1){
            return dp[index][buy];
        }
        int profit=0;
        
        if(buy==0){
           profit= Math.max(0+helper(index+1,0,n,prices,dp),(-1)*prices[index]+helper(index+1,1,n,prices,dp));
            
        }
        if(buy==1){
            profit=Math.max(0+helper(index+1,1,n,prices,dp),prices[index]+helper(index+1,0,n,prices,dp));

        } 
    
        return dp[index][buy]=profit;       

    }

}