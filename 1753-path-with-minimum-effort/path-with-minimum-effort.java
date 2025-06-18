class Solution {
    int m;
    int n;
    private int [][] directions={{-1,0},{1,0},{0,1},{0,-1}};
    public boolean isSafe(int x,int y, int[][] heights){
        if(x>=0 && y>=0 && x<m && y<n){
            return true;
        }
        return false;
    }
    public int minimumEffortPath(int[][] heights) {
        m=heights.length;
        n=heights[0].length;
        int [][] result=new int[m][n];
        for(int [] row: result){
            Arrays.fill(row,Integer.MAX_VALUE);
        }

        result[0][0]=0;

        PriorityQueue<int []> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        pq.add(new int []{0,0,0});

        while(!pq.isEmpty()){
            int [] curr=pq.poll();
            int diff=curr[0];
            int x=curr[1];
            int y=curr[2];

            if(x==m-1 && y==n-1){
                return diff;
            }
            for(int [] dir:directions){
                int x_=x+dir[0];
                int y_=y+dir[1];

                if(isSafe(x_,y_,heights)){
                    int absDiff=Math.abs(heights[x][y]-heights[x_][y_]);
                    int maxDiff=Math.max(diff,absDiff);

                    if(maxDiff<result[x_][y_]){
                        result[x_][y_]=maxDiff;
                        pq.add(new int[]{maxDiff,x_,y_});
                    }
                }
            }
        }
        return result[m-1][n-1];
    }
}