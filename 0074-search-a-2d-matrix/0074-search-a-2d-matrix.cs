public class Solution {
    public bool SearchMatrix(int[][] matrix, int target) {
        bool b=false;
        for(int i=0;i<matrix.Length;i++){
            for(int j=0;j<matrix[i].Length;j++){
                if(matrix[i][j]==target){
                    b=true;
                    break;
                }
            }
        }
        return b;
        
    }
}