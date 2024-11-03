class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]>target){
                h=mid-1;
            }
            else if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
        }
        return -1;

        /*for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;*/
    }
}