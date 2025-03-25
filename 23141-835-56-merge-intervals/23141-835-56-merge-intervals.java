class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int []> result=new ArrayList<>();
        int n=intervals.length;
        for(int i=0;i<n;i++){
            if(result.isEmpty() || intervals[i][0]>result.getLast()[1] ){
                result.add(intervals[i]);
            }
            else{
                result.getLast()[1]=Math.max(result.getLast()[1],intervals[i][1]);
            }
        }

        return result.toArray(new int[result.size()][2]);
    }
}