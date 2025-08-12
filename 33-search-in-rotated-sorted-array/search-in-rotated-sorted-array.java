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
    public int search(int[] nums, int target) {
        int n=nums.length;
        int pivot=-1;
        for(int i=0;i<n;i++){
            if(i+1<n && nums[i]>nums[i+1]){
                pivot=i;
                break;
            }
        }
        System.out.println(pivot);

        int ans=binarySearch(0,pivot,nums,target);
        if(ans==-1){
            return binarySearch(pivot+1,n-1,nums,target);
        }
        return ans;
    }
}