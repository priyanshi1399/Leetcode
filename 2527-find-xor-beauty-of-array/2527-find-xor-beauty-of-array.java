class Solution {
    public int xorBeauty(int[] nums) {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            ans=ans^nums[i];
        }
    return ans;
    }
}