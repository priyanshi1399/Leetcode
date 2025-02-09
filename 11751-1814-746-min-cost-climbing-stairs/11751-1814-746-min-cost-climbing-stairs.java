class Solution {

    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        if(n==2){
            return Math.min(cost[0],cost[1]);
        }

        for(int i=2;i<n;i++){
            cost[i]=cost[i]+Math.min(cost[i-1],cost[i-2]);
        }

        return Math.min(cost[n-1],cost[n-2]);


    }
}
    /*public int helper(int [] cost,int idx,int [] dp){
        int n=cost.length;
        if(idx>=n){
            return 0;
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int oneStep=cost[idx]+helper(cost,idx+1,dp);
        int twoStep=cost[idx]+helper(cost,idx+2,dp);

        return dp[idx]=Math.min(oneStep,twoStep);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int [] dp=new int[n+1];
        Arrays.fill(dp,-1);

        return Math.min((helper(cost,0,dp)),(helper(cost,1,dp)));


    }
}*/