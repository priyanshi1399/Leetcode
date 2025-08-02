class Solution {
    public void swap(int x,int y,int [] nums){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
    public void nextPermutation(int[] nums) {
        int markIndex=-1;
        int n=nums.length;
        for(int i=n-1;i>0;i--){
            if(nums[i-1]<nums[i]){
                markIndex=i-1;
                break;
            }
        }

        int swapIndex=markIndex;
        if(markIndex!=-1){
        for(int i=n-1;i>markIndex;i--){
            if(nums[i]>nums[markIndex]){ //finding element just greater than this element
                    swapIndex=i;
                    swap(swapIndex,markIndex,nums);
                    break;
            }
        }
        }


       

        //reverse
        int low=markIndex+1;
        int high=n-1;
        while(low<high){
            swap(low,high,nums);
            low++;
            high--;
        }
        
    }
}