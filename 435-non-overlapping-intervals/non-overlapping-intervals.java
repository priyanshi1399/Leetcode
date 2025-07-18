class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            int first=a[0];
            int second=b[0];

            return Integer.compare(a[0],b[0]);

        });
        int n=intervals.length;
        int cnt=0;
        int i=0;
        int j=1;
        while(j<n){
            int currentstart=intervals[i][0];
            int currentend=intervals[i][1];
            int nextstart=intervals[j][0];
            int nextend=intervals[j][1];

            if(currentend<=nextstart){
                i=j;
                j++;
            }
            else if(currentend<=nextend){ //[0,4],[2,7] remove bigger one
                j++;
                cnt++;
            }
            else if(currentend>nextend){ //[0,7][2,3] //0,7 will be deleted i will be at 0,7 and j ->2,3
                i=j;
                j++;
                cnt++;
            }
        }
            
        return cnt;
    }
}