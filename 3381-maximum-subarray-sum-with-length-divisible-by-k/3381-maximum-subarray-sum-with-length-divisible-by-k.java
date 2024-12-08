class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long [] prefixArray=new long[nums.length+1];
        for(int i=0;i<nums.length;i++){
            prefixArray[i+1]=prefixArray[i]+nums[i];
        }
        long answer=Long.MIN_VALUE;
        for(int j=0;j<k;j++){
            long sum=0;
            for(int i=j;i+k<=nums.length;i=i+k){
                long subpartSum=prefixArray[i+k]-prefixArray[i]; //prefixArray[2]-prefixArray[0] if k=2
                sum=Math.max(subpartSum,subpartSum+sum);
                answer=Math.max(answer,sum);

            }
        }
        return answer;
    }
}