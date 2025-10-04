class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int area=0;
        int maxArea=0;
        int i=0;
        int j=n-1;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            int w=Math.abs(i-j);
            area=h*w;
            maxArea=Math.max(area,maxArea);

            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
    }
}