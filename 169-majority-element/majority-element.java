class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=1;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(i+1<n && nums[i]!=nums[i+1]){
                count=1;
            }
            else{
                count++;
            }
            if(count>n/2){
                return nums[i];
            }
        }
        return -1;

    }
}