class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        long N=n*n;
        
        long gridSum=0;
        long gridSqSum=0;
        long sum=N*(N+1)/2;
        long sqSum=(N*(N+1)*(2*N+1))/6;


        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                gridSum+=grid[i][j];
                gridSqSum=gridSqSum+(grid[i][j]*grid[i][j]);
            }
        }

        long sqDiff=sqSum-gridSqSum;
        long sumDiff=sum-gridSum;

        int [] ans=new int[2];
        ans[0]=(int)((sqDiff/sumDiff)-sumDiff)/2;
        ans[1]=(int)(sumDiff+(sqDiff/sumDiff))/2;

        return  ans;
    }
}