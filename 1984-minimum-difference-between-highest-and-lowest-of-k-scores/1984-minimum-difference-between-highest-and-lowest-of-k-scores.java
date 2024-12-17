class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k==1){
            return 0;
        }
        Arrays.sort(nums);
        int n=nums.length;
        int diff=Integer.MAX_VALUE; 

        for(int i=0;i<=n-k;i++){
          int left=i;
          int right=left+k-1;
        diff=Math.min(diff,(nums[right]-nums[left]));
        }
        return diff;
    }
}