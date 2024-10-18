class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(i==nums[i]){
                continue;
            }
            else{
                return i;
            }
        }
      
    return n;
    }
}