class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n=grid.length;
        int sqMatrixlen=n*n;
        int [] sqMatrix=new int[sqMatrixlen+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sqMatrix[grid[i][j]]++;
            }
        }

        for(int i=0;i<sqMatrix.length;i++){
          System.out.println(sqMatrix[i]);
        }
        int [] ans=new int[2];
        for(int i=1;i<sqMatrix.length;i++){
            if(sqMatrix[i]==0){
                ans[1]=i;
            }
            if(sqMatrix[i]==2){
                ans[0]=i;
            }
            
        }
        return ans;
    }
}