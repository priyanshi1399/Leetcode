class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n=intervals.length;
        int [] res=new int[intervals.length];
        int index=0;
        for(int i=0;i<n;i++){
            int minValue=Integer.MAX_VALUE;
            index=-1;
            for(int j=0;j<n;j++){
                    if(intervals[i][1]<=intervals[j][0]){
                        if(intervals[j][0]<minValue){
                            index=j;
                            minValue=intervals[j][0]; 
                        }
                        }
                }
               res[i]=index;                
        }
        return res;
    }
}