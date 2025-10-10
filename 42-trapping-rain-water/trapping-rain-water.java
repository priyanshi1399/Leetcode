class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int leftMax=height[0];
        int rightMax=height[n-1];
        int totalWater=0;
        while(left<right){
            if(leftMax<=rightMax){
                totalWater+=leftMax-height[left];
                left++;
                leftMax=Math.max(leftMax,height[left]);
            }
            else{
                   totalWater+=rightMax-height[right];
                   right--;
                   rightMax=Math.max(rightMax,height[right]);
            }
        }
        return totalWater;
    }
}