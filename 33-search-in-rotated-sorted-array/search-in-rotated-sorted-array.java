class Solution {
    public int  binarySearch(int start,int end,int [] nums,int target){
        int low=start;
        int high=end;

        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;

    }
    public int findPivotIndex(int [] nums){
        int l=0;
        int h=nums.length-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(nums[mid]>nums[h]){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
        return h;
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        int pivot=findPivotIndex(nums);
        int ans=binarySearch(0,pivot-1,nums,target);
        if(ans==-1){
            return binarySearch(pivot,n-1,nums,target);
        }
        return ans;
    }
}