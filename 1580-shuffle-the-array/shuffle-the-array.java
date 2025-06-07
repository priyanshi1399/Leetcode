class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len=nums.length;
        //store the pair
        for(int i=n;i<len;i++){
            nums[i]=((nums[i]*1024) | (nums[i-n]));
        }
        //to get those pairs
        int index=0;
        for(int i=n;i<len;i++,index+=2){
            nums[index]=nums[i]%1024;
            nums[index+1]=nums[i]/1024;
        }

        return nums;

    }
}