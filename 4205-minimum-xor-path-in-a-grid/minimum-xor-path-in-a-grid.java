class Solution {
    int m;
    int n;
    public int solve(int [][] grid, int x, int y,int xor,int [][][] dp){
        if(x>=m  ||  y>=n){
                return Integer.MAX_VALUE;
            }

           

            xor=xor^grid[x][y];

            if(dp[x][y][xor]!=-1){
                return dp[x][y][xor];
            }
             if(x==m-1 && y==n-1){
                return xor;
            }
            int right=solve(grid,x,y+1,xor,dp);
            int down=solve(grid,x+1,y,xor,dp);

           return  dp[x][y][xor]=Math.min(down,right);
    }
    public int minCost(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int [][][] dp=new int [m+1][n+1][1024];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }

        return solve(grid, 0,0,0,dp);
    }
}