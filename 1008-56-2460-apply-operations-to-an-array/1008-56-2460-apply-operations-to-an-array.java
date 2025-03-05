class Solution {
    public void swap(int x,int y,int [] nums){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    int j=0;
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if (i+1<n && nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
            if(nums[i]!=0){
                if(i!=j){
                swap(i,j,nums);
            }
            j++;
            }
    }
    return nums;
}
}