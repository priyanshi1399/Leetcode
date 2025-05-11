class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int sum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum+=grid[i][j];
            }
        }

        int rowSum=0;
        for(int i=0;i<m-1;i++){
            for(int j=0;j<n;j++){
                rowSum+=grid[i][j];
            }
            if(rowSum*2==sum){
                return true;
            }
        }

        int colSum=0;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<m;j++){
                colSum+=grid[j][i];
            }
            if(colSum*2==sum){
                return true;
            }
        }
        return false;

    }
}