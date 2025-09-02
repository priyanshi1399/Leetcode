class Solution {
    public int numberOfPairs(int[][] points) {
        int n=points.length;
        int result=0;
        for(int i=0;i<n;i++){
            int x1=points[i][0];
            int y1=points[i][1];

            for(int j=0;j<n;j++){
                if(j==i){
                    continue;
                }
            int x2=points[j][0];
            int y2=points[j][1];

            if(x2>=x1 && y2<=y1){
                boolean hasPointsInside=false;
                for(int k=0;k<n;k++){
                    if(k==i || k==j){
                        continue;
                    }
                    int x3=points[k][0];
                    int y3=points[k][1];

                    if((x3>=x1 && x3<=x2) && (y3>=y2 && y3<=y1)){
                        hasPointsInside=true;
                        break;
                    }
                }
                if(!hasPointsInside){
                    result++;
                }
            }

            }
        }
        return result;
    }
}