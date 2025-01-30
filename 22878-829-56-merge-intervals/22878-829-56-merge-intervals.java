class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int []> res=new ArrayList<>();
        for(int [] i:intervals){
            if(res.isEmpty() || res.getLast()[1]<i[0]){
                res.add(i);
            }
            else{
                res.getLast()[1]=Math.max(res.getLast()[1],i[1]);
            }
        }
        /*int j=0;
        int [][] ans=new int[res.size()][2];
        for(int [] i:res){
            ans[j][0]=i[0];
            ans[j][1]=i[1];
            j++;
        }*/
        int [][] ans=new int[res.size()][2];
        for(int i=0;i<res.size();i++){
            int [] temp=res.get(i);
            for(int j=0;j<2;j++){
                ans[i][j]=temp[j];
            }
        }


        return ans;
    }
}