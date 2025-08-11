class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int col0=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    //mark the row as 0
                    matrix[i][0]=0;
                    //mark the column as 0
                    if(j!=0){  
                    matrix[0][j]=0;
                    }
                    else{
                        col0=0;
                    }
                }
            }
        }

        //traverse without first row and first column
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]!=0){
                    if(matrix[i][0]==0 || matrix[0][j]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }

        //now come to first row and first column first change the column then row
        if(matrix[0][0]==0){ //makrk whole first column 0
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        } //now come to first row
        if(col0==0){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }


    }
}