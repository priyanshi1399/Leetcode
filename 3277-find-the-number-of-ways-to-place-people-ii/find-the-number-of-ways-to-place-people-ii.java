class Solution {
    public int numberOfPairs(int[][] points) {
        int n=points.length;
        int result=0;
        Arrays.sort(points,(a,b)->{
            int val1=a[0];
            int val2=b[0];

            return (val1==val2)?Integer.compare(b[1],a[1]):Integer.compare(a[0],b[0]);
        });

        for(int i=0;i<n;i++){

                int x1=points[i][0];
                int y1=points[i][1];
            int yMax=Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++){
                
                int x2=points[j][0];
                int y2=points[j][1];

                if(y2>y1){
                    continue;
                }

                if(y2>yMax){
                    result++;
                    yMax=y2;
                }

                
            }
        }
        return result;

    }
}