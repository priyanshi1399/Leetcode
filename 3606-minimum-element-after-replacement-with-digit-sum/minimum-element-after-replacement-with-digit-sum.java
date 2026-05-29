class Solution {
    public int convertToSingleDigit(int number){
        int sum=0;
        while(number>0){
            int rem=number%10;
            sum+=rem;
            number=number/10;
        }
        return sum;
    }
    public int minElement(int[] nums) {
        int n=nums.length;
        int minValue=100000;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=convertToSingleDigit(nums[i]);
            minValue=Math.min(minValue,sum);
        }
        return minValue;
    }
}