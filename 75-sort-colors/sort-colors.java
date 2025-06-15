class Solution {
    public void swap(int x,int y,int [] nums){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0;
        int i=0;
        int high=n-1;
        for(i=low; i<=high;){
            if(nums[i]==0){
                swap(low,i,nums);
                low++;
                i++;
            }
            else if(nums[i]==1){
                i++;
            }
            else{
                swap(high,i,nums);
                high--;
            }
        }
    }
}