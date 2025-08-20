class Solution {
    int m;
    int n;
    public int solve(int i,int j,int [][] matrix,int [][] dp){
        if(i>=m || j>=n ){
            return 0;
        }

        if(matrix[i][j]==0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int right=solve(i,j+1,matrix,dp);
        int bottom=solve(i+1,j,matrix,dp);
        int diagonal=solve(i+1,j+1,matrix,dp);

        dp[i][j]= 1+Math.min(right,Math.min(bottom,diagonal));
        return dp[i][j];
    }
    public int countSquares(int[][] matrix) {
        m=matrix.length;
        n=matrix[0].length;
        int result=0;
        int [][] dp=new int[m][n];
        for(int [] row:dp){
            Arrays.fill(row,-1);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==1){ //if cell values is 1 then only square can be created
                    result+=solve(i,j,matrix,dp);
                }
            }
        }
        return result;
    }
}