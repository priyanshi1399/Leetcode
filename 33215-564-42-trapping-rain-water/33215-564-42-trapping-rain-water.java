class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int [] prefixSum=new int[n];
        int [] suffixSum=new int[n];
        prefixSum[0]=height[0];
        for(int i=1;i<n;i++){
            prefixSum[i]=Math.max(prefixSum[i-1],height[i]);
        }


        suffixSum[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            suffixSum[i]=Math.max(suffixSum[i+1],height[i]);
        }
      
        int sum=0;
        for(int i=0;i<n-1;i++){
            sum=sum+(Math.min(prefixSum[i],suffixSum[i])-height[i]);
        }

        return sum;
    }
}