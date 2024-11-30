class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maximumSumEndingHere=nums[0];
        int answer=nums[0];
        for(int i=1;i<n;i++){
                maximumSumEndingHere=Math.max(maximumSumEndingHere+nums[i],nums[i]);
                answer=Math.max(maximumSumEndingHere,answer);
        }
        return answer;
        
/*
maximumSumEndingHere=nums[0]=-2
maximumSumEndingHere=-2+1,1 ->1 is good choice to go
maximumSumEndingHere=-1+(-3),-3 -3 is good to go whatever is maximum go with it
maximumSumEndingHere=-3+4,4 ->4 is good
maximumSumEndingHere=4-1,-1 -->4-1=3 is good
maximumSumEndingHere=3+2,1=>5 is good
maximumSumEndingHere=5+1, 1 =>6 is good 
maximumSumEndingHere=6-5,-5=>1 is good
maximumSumEndingHere=1+4,4 =>5 is good ,here answer contains 6 maximum .



*/


       /*  int maxi = Integer.MIN_VALUE;
        int sum = 0;
        
        for(int i=0;i<nums.length; i++)
        {
            sum =sum+  nums[i];

            if (sum > maxi)
            {
                maxi = sum;
            }

            if (sum < 0)
            {
                sum = 0;
            }
            
        }
        return maxi;*/
    }
}