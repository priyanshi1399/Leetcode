class Solution {
    public int calCount(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }

    public int calCulateSum(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        return sum;
    }



    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            sum1=sum1+nums[i];
            if(calCount(nums[i])>1){
            sum2=sum2+calCulateSum(nums[i]);
            }
            else{
                sum2+=nums[i];
            }
        }
        return Math.abs(sum1-sum2);
    }
}