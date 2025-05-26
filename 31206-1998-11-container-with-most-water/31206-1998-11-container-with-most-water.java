class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int area=0;
        while(i<j){
            int h=Math.min(height[i],height[j]);
            int w=Math.abs(i-j);
            area=Math.max(h*w,area);
            //System.out.println(area);
            
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }

        }
        return area;
    }
}