class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int j=-1;
        int i=0;
        while(i<n){
            if(nums[i]==0){
                j=i;
                break;
            }
            i++;
        }

        if(j==-1){
            return;
        }
        for(i=j+1;i<n;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }

        
    }
}