class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int maxArea=0;
        int [] prevRow=new int[n];
        for(int row=0;row<m;row++){
            int [] currRow=matrix[row].clone();
            for(int col=0;col<n;col++){
                if(currRow[col]==1){
                    currRow[col]+=prevRow[col]; //adding consecutive 1s
                }
            }

            //now sort the rows in descending order
            int [] sortedRow=currRow.clone(); //exactly copying the rows
            //sorting in ascending
            Arrays.sort(sortedRow);

        //calculating Area
        for(int i=0;i<n;i++){
            int width=n-i; //box base will be like i=0base 1 i=1 base 2 but we have our array in descending so n-i;
            int height=sortedRow[i];
            maxArea=Math.max(maxArea,width*height);
        }
            prevRow=currRow ;// assigning prevRow to currRow
        }
        return maxArea;
    }
}