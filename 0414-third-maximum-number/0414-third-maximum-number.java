class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int count=1; //initially one distinct
        int flag=0;
     //1 2  2 3
        for(int i=n-1;i>0;i--){
        if(nums[i]==nums[i-1]){
            flag=flag+1; //flag=1
        }
        else{
            count=count+1; //++1  ++2  4-2-1
        }
        if(count==3){
            return nums[n-count-flag];
        }
        }
        return nums[n-1];
    }
}