class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        //Solution using one Loop
        int maxLen=0;
        int count=0;
        int n=rectangles.length;
        for(int i=0;i<n;i++){
            int maxSideOfSquare=Math.min(rectangles[i][0],rectangles[i][1]);
            if(maxLen<maxSideOfSquare){
                maxLen=maxSideOfSquare;
                count=1;
            }
            else if(maxLen==maxSideOfSquare){
                count++;
            }
        }
    return count;

        //Solution using two Loops
        /*int n=rectangles.length;
        int maxLen=0;
        for(int i=0;i<n;i++){
       int maxSideOfSquare=Math.min(rectangles[i][0],rectangles[i][1]);
        maxLen=Math.max(maxLen,maxSideOfSquare);
        }
        int count=0;
        for(int i=0;i<n;i++){
            int maxSideOfSquare=Math.min(rectangles[i][0],rectangles[i][1]);
            if(maxLen==maxSideOfSquare){
                count++;
            }

        }
        return count;*/
    }
}

//Take this Example to Dry Run: [3,2],[5,6],[2,3],[5,7],[8,9],[8,10]
//most important is count here 