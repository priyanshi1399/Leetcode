class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int m=points.length;
        int count=0;
        for(int i=0;i<m-1;i++){
            int x1=points[i][0];
            int y1=points[i][1];

            int x2=points[i+1][0];
            int y2=points[i+1][1];

            //geranlised formula
            
            int dx=Math.abs(x1-x2);
            int dy=Math.abs(y1-y2);
            count+=Math.min(dx,dy)+Math.abs(dx-dy);
            
            


        }
        return count;
    }
}