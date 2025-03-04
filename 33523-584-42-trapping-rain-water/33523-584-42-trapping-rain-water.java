class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftMax=height[0];
        int rightMax=height[n-1];

        int i=0;
        int j=n-1;
        int sum=0;
        while(i<j){
            if(leftMax<=rightMax){
                sum=sum+leftMax-height[i];
                i++;
                leftMax=Math.max(leftMax,height[i]);
            }
            else{
                sum=sum+rightMax-height[j];
                j--;
                rightMax=Math.max(rightMax,height[j]);
            }
        }
        return sum;
    }
}