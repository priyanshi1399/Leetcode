class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int index=-1;
        int i=0;
        while(i<n){
            if(nums[i]==0){
                index=i;
                break;
            }
            i++;
        }

        if(index==-1){
            return;
        }
        for(int start=index+1;start<n;start++){
            if(nums[start]!=0){
                int temp=nums[start];
                nums[start]=nums[index];
                nums[index]=temp;
                index++;
            }
        }

        
    }
}