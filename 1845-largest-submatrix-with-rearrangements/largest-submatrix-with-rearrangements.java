class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int maxArea=0;
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                if(matrix[row][col]==1 && row>0){
                    matrix[row][col]+=matrix[row-1][col]; //adding consecutive 1s
                }
            }

            //now sort the rows in descending order
            int [] currRow=matrix[row].clone(); //exactly copying the rows
            //sorting in ascending
            Arrays.sort(currRow);

        //calculating Area
        for(int i=0;i<n;i++){
            int width=n-i; //box base will be like i=0base 1 i=1 base 2 but we have our array in descending so n-i;
            int height=currRow[i];
            maxArea=Math.max(maxArea,width*height);
        }
        }
        return maxArea;
    }
}