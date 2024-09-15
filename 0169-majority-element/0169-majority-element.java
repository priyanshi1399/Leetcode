class Solution {
    public int majorityElement(int[] nums) {
        int cnt=1;
        int n=nums.length;
        Arrays.sort(nums);
        if(n==1){
            return nums[0];
        }
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                cnt++;
                if(cnt>n/2){
                    return nums[i];
                }
            }
        }
        return 0;
    }
}