class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=1;i<n;i+=2){
            if(nums[i-1]!=nums[i]){
                return false;
            }
        }
        return true;
    }
}