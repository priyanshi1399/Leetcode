class Solution {
    public int singleNumber(int[] nums) {
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            ans= ans^nums[i];
        }
        return ans;
    }
}
/*
4^1^2^1^2
4^1^1^2^2
4^0^0
4^0
4

4^1=100^001=101
101^010=111
111^001=110
110^010=100
*/