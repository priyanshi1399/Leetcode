class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n=grid.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    if(grid[i][j]!=0){
                    count++;
                    }
                    else{
                        count--;
                    }
                }
                else if(i!=j){
                    if(grid[i][j]==0){
                    count++;
                    }
                    else{
                        count--;
                    }
                }
            }
        }           
        if(count==n*n){
            return true;
        }
        else{
            return false;
        }
    }
}