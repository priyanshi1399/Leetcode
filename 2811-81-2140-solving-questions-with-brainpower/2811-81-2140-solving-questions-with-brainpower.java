class Solution {
    
    private long solve(int index, int [][] questions,int n,long [] dp){
        if(index>=n){
            return 0;
        }
        if(dp[index]!=-1){
            return dp[index];
        }

        long take=questions[index][0]+solve(index+questions[index][1]+1,questions,n,dp);
        long notTake=solve(index+1,questions,n,dp);

        dp[index]=Math.max(take,notTake);
        return dp[index];
    }
    public long mostPoints(int[][] questions) {
        int n=questions.length;
        long [] dp=new long[n+1];
        Arrays.fill(dp,-1);
        return solve(0,questions,n,dp);
        
    }
}