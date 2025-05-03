class Solution {
          int [][] directions={{-1,0},{1,0},{0,1},{0,-1},{-1,1},{1,1},{-1,-1},{1,-1}};
       
    public boolean isSafe(int x,int y,int n,int m){
        if(x>=0 && y>=0 && x<n && y<m){
            return true;
        }
        return false;
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        if(m==0 || n==0 || grid[0][0]==1){
            return -1;
        }
        int [][] res=new int[m][n];
        for(int [] row:res){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        res[0][0]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        pq.add(new int[]{0,0,0});

        while(!pq.isEmpty()){

           
            int [] curr=pq.poll();
            int d=curr[0];
            int x=curr[1];
            int y=curr[2];

            int dist=1;
            for(int [] dir: directions){
                int x_=x+dir[0];
                int y_=y+dir[1];

                if(isSafe(x_,y_,m,n) && grid[x_][y_]==0 && d+dist<res[x_][y_]){
                        res[x_][y_]=d+dist;
                        //grid[x_][y_]=1; can skip because already here distance will be less only 
                        pq.add(new int[]{d+dist,x_,y_});
                }
            }
        }
        if(res[m-1][n-1]==Integer.MAX_VALUE){
            return -1;
        }
        return res[m-1][n-1]+1;

    }
}