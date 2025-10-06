class Solution {
    public final int [][] direction={{-1,0},{0,1},{1,0},{0,-1}};
    public boolean isSafe(int x,int y,int [][] grid){
        if(x<0 || y<0 || x>=grid.length || y>=grid.length){
            return false;
        }
        return true;
    }
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        int [][] result=new int[n][n];
        for(int [] row:result){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        result[0][0]=0;


        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));

        pq.add(new int[]{grid[0][0],0,0});
        while(!pq.isEmpty()){
            int [] curr=pq.poll();
            int diff=curr[0];
            int x=curr[1];
            int y=curr[2];
            if(x==n-1 & y==n-1){
                return diff;
            }
            for(int[] dir:direction){
                int x_=x+dir[0];
                int y_=y+dir[1];
                if(isSafe(x_,y_,grid)){
                    int newDiff=Math.max(grid[x_][y_],diff);


                    if(newDiff<result[x_][y_]){
                        result[x_][y_]=newDiff;
                        pq.add(new int []{newDiff,x_,y_});
                    }
                }
            }
         
        }
        return result[n-1][n-1];

    }
}