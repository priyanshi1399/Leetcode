class Solution {
    public int climbStairs(int n, int[] costs) {
        int [] dp=new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        for(int i=-1;i<n;i++){
            int prev=i>=0?dp[i]:0;
            for(int j=i+1;j<=i+3 && j<n;j++){
                dp[j]=Math.min(dp[j],prev+costs[j]+(j-i)*(j-i));
            }
        }
        return dp[n-1];
    }
}