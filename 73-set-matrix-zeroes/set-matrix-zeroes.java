class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        boolean isfirstRowImpacted =false;
        boolean isfirstColImpacted=false;

            //check if row is Impacted
            for(int col=0;col<n;col++){
                if(matrix[0][col]==0){
                    isfirstRowImpacted=true;
                    break;
                }
            }
            //check if column is impacted

        for(int row=0;row<m;row++){
                if(matrix[row][0]==0){
                    isfirstColImpacted=true;
                    break;
                }
        }


        //set markers in first row and first column
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                  if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                  }
                }
            }

        //set other row col 0 if first row or first col=0
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                  matrix[i][j]=0;
                }
            }
        }

        if(isfirstRowImpacted){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }

        if(isfirstColImpacted){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }


    }
}