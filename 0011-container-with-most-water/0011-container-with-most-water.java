class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int maxArea=0;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            int w=j-i;
            int area=h*w;
            maxArea=Math.max(maxArea,area);
            if(height[i]>height[j]){
                j--; //j is smaller
            }
            else{
                i++; // height at i is small
            }
        }
        return maxArea;
    }
}