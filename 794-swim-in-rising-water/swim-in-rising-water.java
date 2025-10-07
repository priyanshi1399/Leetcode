class Solution {
    private boolean [][] visited;
    private final int [][] directions={{0,-1},{0,1},{1,0},{-1,0}};
    int n;
    public int swimInWater(int[][] grid) {
        n=grid.length;
        int low=0;
        int high=n*n;
        int result=0;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            visited=new boolean[n][n];
            if(isPossibleToSwim(mid,grid,0,0)){
                result=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
    public boolean isPossibleToSwim(int mid,int [][] grid, int i, int j){

        
        if(i<0 || j<0 || i>=grid.length || j>=grid.length || grid[i][j]>mid || visited[i][j]){
            return false;
        }

        visited[i][j]=true;
        if(i==n-1 && j==n-1){
            return true;
        }
        for(int [] dir:directions){
            int i_=i+dir[0];
            int j_=j+dir[1];
        if(isPossibleToSwim(mid,grid,i_,j_)){
            return true;
        }
    }
    return false;
}
}