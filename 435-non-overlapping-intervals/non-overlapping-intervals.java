class Solution {
    //similar as max meeting in single room
    public  class Overlap implements Comparator<int[]>{
        @Override
        public int compare(int [] a,int [] b){
            return Integer.compare(a[1],b[1]);
        }
    }
    public int eraseOverlapIntervals(int[][] intervals) {
        int n=intervals.length;
        int count=1;
        Arrays.sort(intervals,new Overlap());
        int lastInterval=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]>=lastInterval){
                count++;
                lastInterval=intervals[i][1]; //bigger value
            }
        }
        return n-count;
    }
}