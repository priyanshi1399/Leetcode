class Solution {
    public void swap(int x,int y,int [] nums){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        int mid=0;
        int low=0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(low,mid,nums);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(high,mid,nums);
                high--;
            }
        }
    }
}