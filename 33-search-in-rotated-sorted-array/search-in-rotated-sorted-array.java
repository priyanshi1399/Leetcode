class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<=nums[mid]){ //target should be in left
                        high=mid-1; //eliminate right side part
                }
                else{
                    low=mid+1; //eliminate left part
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1; //eliminate left part
                }
                else{
                    high=mid-1; //eliminate right part
                }
            }
        }
        return -1; 
    }
}