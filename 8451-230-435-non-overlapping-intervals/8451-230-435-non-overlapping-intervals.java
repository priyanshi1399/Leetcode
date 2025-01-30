class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->{
        int value1=a[1];
        int value2=b[1];

        return value1==value2?Integer.compare(a[0],b[0]):Integer.compare(a[1],b[1]);
       });
        int prev=intervals[0][1];
        int count=0;
        for(int i=1;i<intervals.length;i++){
            if(prev>intervals[i][0]){
                count++;
            }
            else{
            prev=intervals[i][1];
        }
        }
        return count;
    }
}