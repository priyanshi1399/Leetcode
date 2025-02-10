
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int [] dp=new int[n+1];
        Arrays.fill(dp,1);
        int maxLIS=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                    maxLIS=Math.max(maxLIS,dp[i]);
                }
            }
        }
        return maxLIS;
    }
}


/*
 public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int [][] dp=new int [n+1][n+1];
        for(int [] row: dp){
            Arrays.fill(row,-1);
        }
        return solve(0,-1,nums,dp);
    }

    public int solve(int i,int p,int [] nums,int [][] dp){
        int n=nums.length;
        if(i>=n){
            return 0;
        }
        if(p!=-1 && dp[i][p]!=-1){
            return dp[i][p];
        }
        int take=0;
        if(p==-1 || nums[p]<nums[i]){
             take=1+solve(i+1,i,nums,dp); //here prev is getting changed because we are taking
        }

        int skip=solve(i+1,p,nums,dp); //here p will not chang becaue we are not taking

        if(p!=-1){
        dp[i][p]=Math.max(take,skip);

        }
        return Math.max(take,skip);
}

*/