class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftMax=height[0];
        int rightMax=height[n-1];
        int i=0;
        int j=n-1;
        int total=0;
        while(i<=j){
            if(leftMax<=rightMax){
                leftMax=Math.max(height[i],leftMax);
                total+=leftMax-height[i];
                i++;
            }
            else{
                rightMax=Math.max(rightMax,height[j]);
                 total+=rightMax-height[j];
                 j--;
            }
        }
        return total;

    }
}