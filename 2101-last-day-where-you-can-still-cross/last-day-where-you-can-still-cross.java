class Solution {
    int rows;
    int cols;
    
    private final int [][] directions={{-1,0},{1,0},{0,-1},{0,1}};
    public boolean dfs(int [][] grid, int i,int j){
           
        if(i<0 || j>=cols || i>=rows || j<0 || grid[i][j]==1){
            return false;
        }

        if(i==rows-1){
            return true;
        }

        grid[i][j]=1; //mark as visited
        
    

        for(int [] dir:directions){
            int x_=i+dir[0];
            int y_=j+dir[1];

            if(dfs(grid,x_,y_)){
                return true;
            }

        }
        return false;


    }
    public boolean canCross(int day,int [][] cells){

        int [][] grid=new int[rows][cols];

        for(int i=0;i<=day;++i){

           int r= cells[i][0]-1; //row for filling till day
            int c=cells[i][1]-1;

            grid[r][c]=1;

        }

        for(int j=0;j<cols;j++){
            if(grid[0][j]==0 && dfs(grid,0,j)){
                return true;
            }
        }
        return false;

    }
    public int latestDayToCross(int row, int col, int[][] cells) {
        rows=row;
        cols=col;

        int [][] grid=new int[rows][cols];
        int l=0;
        int r=cells.length-1;
        int lastDayToReach=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(canCross(mid,cells)){
                lastDayToReach=mid+1;
                l=mid+1; //if can cross goa nd check for more
            }
            else{
                r=mid-1;
            }
        }

        return lastDayToReach;

    }
}