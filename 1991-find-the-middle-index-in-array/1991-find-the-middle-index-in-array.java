class Solution {
 public int calculateLeftSum(int k,int [] nums){
        int leftSum=0;
        for(int i=k;i>=0;i--){
            leftSum=leftSum+nums[i];
        }
        return leftSum;
    }

    public int calculateRightSum(int k,int [] nums){
        int rightSum=0;
        for(int i=k;i<nums.length;i++){
            rightSum=rightSum+nums[i];
        }
        return rightSum;
    }

    public int findMiddleIndex(int[] nums) {
        int leftSum=0;
        int rightSum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(i==0){
                leftSum=0;
                rightSum=calculateRightSum(i+1,nums);
            }
            if(i==n-1){
                rightSum=0;
                 leftSum= calculateLeftSum(i-1,nums);
            }
            else{
            leftSum= calculateLeftSum(i-1,nums);
            rightSum=calculateRightSum(i+1,nums);
            }

            if(leftSum==rightSum){
              return i;
            }

        }
        return -1;
    }
}