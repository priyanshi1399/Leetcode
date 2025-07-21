class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            int first=a[0];
            int second=b[0];

            return first!=second?Integer.compare(first,second): Integer.compare(a[1],b[1]);
        });
        List<int[]> ans=new ArrayList<>();
        for(int [] interval :intervals){
            if(ans.isEmpty() || ans.getLast()[1]<interval[0]){
                ans.add(interval);
            }
            else{
                ans.getLast()[1]=Math.max(ans.getLast()[1],interval[1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}