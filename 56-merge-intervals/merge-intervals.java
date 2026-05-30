class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            int val1=a[0];
            int val2=b[0];
            return val1!=val2?Integer.compare(a[0],b[0]):Integer.compare(a[1],b[1]);
        });

        List<int []> ans=new ArrayList<>();
        for(int [] interval:intervals){
            if(ans.isEmpty() || ans.getLast()[1]<interval[0]){
                ans.add(interval);
            }
            else{
                ans.getLast()[1]=Math.max(ans.getLast()[1],interval[1]);
            }
        }
        return ans.toArray(new int [ans.size()][2]);
    }
}