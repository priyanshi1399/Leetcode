class Solution {
   
    public boolean checkIfRowPossible(int [][] matrix,long half){
         long sum=0;
         int m=matrix.length;
         int n=matrix[0].length;
         for(int i=0;i<m;i++){
                sum+=matrix[i][n-1];
                if(half==sum){
                    return true;
                }
            }
         return false;
    }

     public boolean checkIfColumnPossible(int [][] matrix,long half){
         long sum=0;
         int count=1;
         int m=matrix.length;
         int n=matrix[0].length;
         for(int i=0;i<n;i++){
                sum+=matrix[m-1][i];
                if(half==sum){
                    return true;
                }
            }
         return false;
    }

    public boolean canPartitionGrid(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        long totalSum=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                totalSum+=grid[i][j];
            }
        }
        if(totalSum%2!=0){
            return false;
        }
        long half=totalSum/2;
          
        
        int [][] RowMatrix=new int[m][n];
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=grid[i][j];
                RowMatrix[i][j]=sum;
            }
        }

     

        int [][] colMatrix=new int[m][n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                sum+=grid[j][i];
                colMatrix[j][i]=sum;
            }
        }
         if(checkIfRowPossible(RowMatrix,half) || checkIfColumnPossible(colMatrix,half) ){
            return true;
        }
        return false;
    }
}