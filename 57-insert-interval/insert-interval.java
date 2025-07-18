class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0])); //for concurrent interval to come at once 
        int n=intervals.length;
        int i=0;
        List<int[]> res=new ArrayList<>();
        while(i<n && intervals[i][1]<newInterval[0]){
            res.add(intervals[i]);
            i++;
        }

        while(i<n && intervals[i][0]<=newInterval[1] ){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        }

        res.add(newInterval); //[3,5],[6,7],[8,10],[12,16]-->[3,10]
    

        while(i<n){
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[res.size()][]);

    }
}