class Solution {
    public void swap(int x,int y,int [] nums){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            if (i+1<n && nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
            else{
                continue;
            }
        }
        int i=0;
        while(i<n){
            if(nums[i]==0){
                int index=i;
                for(int j=index+1;j<n;j++){
                    if(nums[j]!=0){
                        swap(i,j,nums);
                        break;
                    }
                }
            }
            i++;
        }
        return nums;
    }
}