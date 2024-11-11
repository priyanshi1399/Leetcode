class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i=i+3){
            if(nums[i]!=nums[i-1]){
                return nums[i-1];
            }
        }
        return nums[n-1];
    /*
        int ans=0;
        for(int bitIndex=0;bitIndex<32;bitIndex++){
            int count_ith=0;
            for(int i=0;i<nums.length;i++){
                if((nums[i] & (1<<bitIndex))!=0){
                    count_ith++; //checking set bit at ith position
                }
            }
            if(count_ith%3!=0){
                ans=ans | (1<<bitIndex);
            }
        }
        return ans;*/
    }
}