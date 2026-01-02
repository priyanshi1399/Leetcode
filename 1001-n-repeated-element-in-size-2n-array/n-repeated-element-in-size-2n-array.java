class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(i+1<n && nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return 0;

    }
}