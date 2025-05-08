class Solution {
    int m;
    int n;
    private final int [][] directions={{0,1},{0,-1},{1,0},{-1,0}};
    public boolean isSafe(int x,int y){
        if(x>=0 && y>=0 && x<m && y<n){
            return true;
        }
        return false;
    }
    public int minTimeToReach(int[][] moveTime) {
        m=moveTime.length;
        n=moveTime[0].length;
        int [][] result=new int[m][n];
        for(int [] row: result){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        result[0][0]=0;

        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        pq.add(new int[]{0,0,0});
        while(!pq.isEmpty()){
            int [] curr=pq.poll();
            int currTime=curr[0];
            int x=curr[1];
            int y=curr[2];

            if(x==m-1 && y==n-1){
                    return currTime;
                }
            for(int [] dir:directions){
                int x_=x+dir[0];
                int y_=y+dir[1];
               
               if(isSafe(x_,y_)){
                int waitTime=Math.max(moveTime[x_][y_]-currTime,0);
                int finalTime=waitTime+currTime+1;

               
                if(finalTime<result[x_][y_]){
                    result[x_][y_]=finalTime;
                    pq.add(new int[] {finalTime,x_,y_});
                }
            }
        }
        }
        return result[m-1][n-1];
    }
}