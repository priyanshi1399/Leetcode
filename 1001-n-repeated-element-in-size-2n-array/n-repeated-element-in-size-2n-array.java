class Solution {
    public int repeatedNTimes(int[] nums) {
        //50% of the array covered by this element

        int n=nums.length;
        for(int i=2;i<n;i+=2){
            if(nums[i]==nums[i-1] || nums[i]==nums[i-2]){
                return nums[i];
            }
        }
        return nums[n-1];
    }
}