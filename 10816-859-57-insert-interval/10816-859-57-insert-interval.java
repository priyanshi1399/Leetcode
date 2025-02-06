class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        List<int []> res=new ArrayList<>();

        int i=0;
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            res.add(intervals[i]);
            i++;
        }

        while(i<intervals.length && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }


        res.add(newInterval);

        while(i<intervals.length){
            res.add(intervals[i]);
            i++;
        }

        /*int [][] ans=new int[res.size()][2];
        for(i=0;i<res.size();i++){
            ans[i][0]=res.get(i)[0];
            ans[i][1]=res.get(i)[1];
        }
        return ans;*/
        return res.toArray(new int [res.size()][]);

    }
}