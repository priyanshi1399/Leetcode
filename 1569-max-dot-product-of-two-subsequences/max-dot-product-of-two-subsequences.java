class Solution {
    int m;
    int n;
    public int solve(int [] nums1,int [] nums2,int i,int j,int [][] dp){
        if(i>=m || j>=n){
            return -100000000; //why min_value because if we return 0 for out of bound it will give 0 as max which is wrong
        }
        if(dp[i][j]!=-100000000){
            return dp[i][j];
        }
        int take_i_j=nums1[i]*nums2[j];
        int take_i_j_ask_further=nums1[i]*nums2[j]+solve(nums1,nums2,i+1,j+1,dp); //ask further to calculate
        int take_i=solve(nums1,nums2,i,j+1,dp);
        int take_j=solve(nums1,nums2,i+1,j,dp);

        dp[i][j]= Math.max(take_i_j,Math.max(take_i_j_ask_further,Math.max(take_i,take_j)));
        return dp[i][j];

    }
    public int maxDotProduct(int[] nums1, int[] nums2) {

        m=nums1.length;
        n=nums2.length;
        int [][] dp=new int[501][501];
        for(int i=0;i<501;i++){
            Arrays.fill(dp[i],-100000000);
        }
     
        return solve(nums1,nums2,0,0,dp);
        
    }
}