class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n=nums.length;
        int idx=n-1;
        while(idx>0){
            if(nums[idx]<=nums[idx-1]){
                return idx;
            } 
                idx--;
            }
            return 0;
        }
    }
