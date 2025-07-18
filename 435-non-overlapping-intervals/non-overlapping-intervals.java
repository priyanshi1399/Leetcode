class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            int first=a[0];
            int second=b[0];

            return Integer.compare(a[0],b[0]);

        });
        int n=intervals.length;
        int cnt=0;
        int [] lastInterval=intervals[0];
        int i=1;
        while(i<n){
            int curr_start=intervals[i][0];
            int curr_end=intervals[i][1];
            int last_end=lastInterval[1];
            if(last_end<=curr_start){ //this is safe
                lastInterval=intervals[i];
            }
            else if(lastInterval[1]<=curr_end){
                    cnt++; //drop greedly and move forward
            }
            else if(last_end>curr_end){
                    lastInterval=intervals[i]; //remove the previous greater interval
                    cnt++;
            }
            i++; //i increases at every step
        }
        return cnt;
    }
}