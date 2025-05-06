class Solution {
    int m;
    int n;
    int [][] direction={{0,-1},{0,1},{1,0},{-1,0}};
    Queue<int []> q=new LinkedList<>();
    public boolean isSafe(int x,int y){
        if(x>=0 && y>=0 && x<m && y<n){
            return true;
        }
        return false;
    }
    public int orangesRotting(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int freshOrange=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    freshOrange++;
                }
                else if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }
            }
        }

        //not found any fresh orange
        if(freshOrange==0){
            return 0;
        }
        int time=0;
        while(!q.isEmpty()){
            int size=q.size();
            while(size--> 0){
                int [] curr=q.poll();
                int x=curr[0];
                int y=curr[1];

                for(int [] dir: direction){
                    int x_=x+dir[0];
                    int y_=y+dir[1];

                    if(isSafe(x_,y_) && grid[x_][y_]==1){
                        grid[x_][y_]=2;
                        freshOrange--;
                        q.add(new int []{x_,y_});
                    }
                }
            }
            time++;
        }
        if(freshOrange==0){
            return time-1;
        }
        return -1;
       
    }
}