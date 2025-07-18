class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            int first=a[0];
            int second=b[0];

            return Integer.compare(a[1],b[1]);

        });
        int n=intervals.length;
        int cnt=0;
        int prev=0;
        int curr=1;
        for(int i=0;i<n-1;i++){
            
            if( intervals[prev][1]<=intervals[curr][0]){
                prev=curr;
                curr++;
            }
            else{
                cnt++;
                curr++;
            }
        }
        return cnt;
    }
}