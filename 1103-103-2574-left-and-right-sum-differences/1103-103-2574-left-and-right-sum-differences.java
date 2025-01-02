class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int [] prefixSum=new int[n];
        int [] suffixSum=new int[n];
        int [] ans=new int[n];
        prefixSum[0]=0;
        for(int i=1;i<n;i++){
        prefixSum[i]=prefixSum[i-1]+nums[i-1];
        }

        suffixSum[n-1]=0;
        for(int i=n-2;i>=0;i--){
            suffixSum[i]=suffixSum[i+1]+nums[i+1];
        }

        for(int i=0;i<n;i++){
            ans[i]=Math.abs(prefixSum[i]-suffixSum[i]);
        }
        return ans;

    }
}