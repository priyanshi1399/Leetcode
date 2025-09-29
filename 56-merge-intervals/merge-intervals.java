class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> res=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->{
            int val1=a[0];
            int val2=b[0];
            return val1==val2?Integer.compare(a[1],b[1]):Integer.compare(a[0],b[0]);
        });
        for(int [] i:intervals){
            if(res.isEmpty() || res.get(res.size()-1)[1]<i[0]){
                res.add(i);
            }
            else{
                res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],i[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}