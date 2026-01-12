class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int m=points.length;
        int count=0;
        for(int i=0;i<m-1;i++){
            int start_ith=points[i][0];
            int end_ith=points[i][1];

            int start_jth=points[i+1][0];
            int end_jth=points[i+1][1];

          
            int maxVal=Math.max((start_jth-start_ith)<0?(-1)*(start_jth-start_ith):(start_jth-start_ith),(end_jth-end_ith)<0?(-1)*(end_jth-end_ith):(end_jth-end_ith));
            
            if(maxVal<0){
                maxVal=maxVal*(-1);
            }

            count+=maxVal;
            
            


        }
        return count;
    }
}