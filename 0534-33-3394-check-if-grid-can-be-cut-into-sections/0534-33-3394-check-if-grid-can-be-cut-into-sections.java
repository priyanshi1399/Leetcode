class Solution {

        public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int []> result=new ArrayList<>();
        int n=intervals.length;
        for(int i=0;i<n;i++){
            if(result.isEmpty() || intervals[i][0]>=result.getLast()[1] ){
                result.add(intervals[i]);
            }
            else{
                result.getLast()[1]=Math.max(result.getLast()[1],intervals[i][1]);
            }
        }

        return result.toArray(new int[result.size()][2]);
    }

    public boolean checkValidCuts(int n, int[][] rectangles) {
        List<int[]> horizon=new ArrayList<>();
        List<int []> vertical=new ArrayList<>();

        for(int i=0;i<rectangles.length;i++){
            horizon.add(new int []{rectangles[i][0],rectangles[i][2]});
            vertical.add(new int []{rectangles[i][1],rectangles[i][3]});
        }

        int [][] horizonArray=horizon.toArray(new int[horizon.size()][2]);
        int [][] verticalArray=vertical.toArray(new int[vertical.size()][2]);

        int [][] result1=merge(horizonArray);
        int [][] result2=merge(verticalArray);
        if(result1.length>=3 || result2.length>=3){
            return true;
        }
        return false;
    }
}