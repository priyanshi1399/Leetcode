class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int start=0;
        int end=n-1;
        int maxWater=0;
        //take start and take end point
        while(start<end){

            int width=end-start; //(width window)
            int height_Building=Math.min(height[start],height[end]); //why min bcz water will contain till minimum height only        
            maxWater=Math.max(maxWater,height_Building*width);

            if(height[start]>height[end]){
                end--; //start is greater we will keep that height to increase Area
            }
            else{
                start++; //end is greater so move start
            }

        }
        return maxWater;
    }
}