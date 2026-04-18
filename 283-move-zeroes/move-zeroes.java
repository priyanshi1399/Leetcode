class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int index=-1;
       
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                index=i;
                break;
            }
        }

        if(index==-1){
            return;
        }

        int j=index+1;
        while(j<n){
            if(nums[j]!=0){
                int temp=nums[index];
                nums[index]=nums[j];
                nums[j]=temp;
                index++;
                j++;
            }
            else{
            j++;
            }
        }
    }
}

//0,1,0,3,12

//1,0,0,3,12
