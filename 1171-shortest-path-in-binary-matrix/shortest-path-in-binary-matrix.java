class Solution {
    int m;
    int n;
    private final int [][] directions={{-1,0},{1,0},{0,1},{0,-1},{1,1},{-1,-1},{1,-1},{-1,1}};
    public boolean isSafe(int x,int y, int [][] grid){
        if(x>=0 &&y>=0 && x<m && y<n){
            return true;
        }
        return false;
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int [][] res=new int [m][n];
        for(int [] row:res){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        res[0][0]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        if(grid[0][0]==1){
            return -1;
        }
        pq.add(new int[]{0,0,0});
        while(!pq.isEmpty()){
            int [] curr=pq.poll();
            int d=curr[0];
            int x=curr[1];
            int y=curr[2];
            int dist=1;
            if(x==m-1 && y==n-1){
                return res[m-1][n-1]+1;
            }
            for(int [] dir:directions){
                int x_=x+dir[0];
                int y_=y+dir[1];
                if(isSafe(x_,y_,grid) && grid[x_][y_]==0){
                    if(d+dist<res[x_][y_]){
                        pq.add(new int[] {d+dist,x_,y_});
                        res[x_][y_]=d+dist;
                    }

                }
            }
        }

        if(res[m-1][n-1]==Integer.MAX_VALUE){
            return -1;
        }
        return res[m-1][n-1]+1;
    }
}