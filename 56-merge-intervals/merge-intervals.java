class Solution {
    public int[][] merge(int[][] intervals) {
        List<int []> ans=new ArrayList<>();
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->{
            int val1=a[0];
            int val2=b[0];
            return val1!=val2?Integer.compare(a[0],b[0]):Integer.compare(a[1],b[1]);
        });
        // for(int i=0;i<n;i++){
        //     System.out.println(intervals[i][0] + ":" +intervals[i][1]);
        // }
        for(int i=0;i<n;i++){
            if(ans.isEmpty() || intervals[i][0]>ans.getLast()[1]){
                    ans.add(intervals[i]);
            }
            else{
                ans.getLast()[1]=Math.max(intervals[i][1],ans.getLast()[1]);
        }
        }
       
        return ans.toArray(new int [ans.size()][2]);
    }
}