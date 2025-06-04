class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        
        int total=0;
        for(int i=0;i<n;i++){
            total+=nums[i];

        }
        int prefixSum=0;
        int [] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(prefixSum-(total-prefixSum-nums[i]));
            prefixSum+=nums[i];
        }
        return ans;
    }
}