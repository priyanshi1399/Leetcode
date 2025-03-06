class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        long N=n*n;
        long gridSum=0;
        long gridSquareSum=0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                gridSum+=grid[i][j];
                gridSquareSum+=grid[i][j]*grid[i][j];
            }
        }

        long sum=N*(N+1)/2;

        long squareSum=N*(N+1)*(2*N+1)/6;

        int [] result=new int[2];
        long squareDiff=squareSum-gridSquareSum;
        long sumDiff=sum-gridSum;
        result[0]=(int)(squareDiff/sumDiff-sumDiff)/2;
        result[1]=(int)(sumDiff+(squareDiff/sumDiff))/2;

        return result;
    }
}