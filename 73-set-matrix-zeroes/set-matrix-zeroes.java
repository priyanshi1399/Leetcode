class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int [] row=new int[m];
        int [] col=new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    row[i]=1; //mark the row as 1 which is 0 in matrix
                    col[j]=1; //mark the col as 1 which is 1 in matrix
                }
            }
        }

         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(row[i]==1 || col[j]==1){
                matrix[i][j]=0;
               }
            }
        }
    }
}