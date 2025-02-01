class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i+1<n && nums[i]%2==0 && nums[i+1]%2==0){
                return false;
            }
            else if(i+1<n && nums[i]%2!=0 && nums[i+1]%2!=0){
                return false;
            }
        }
        return true;
    }
}