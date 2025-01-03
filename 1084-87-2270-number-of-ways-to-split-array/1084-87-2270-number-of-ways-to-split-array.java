class Solution {
    public int waysToSplitArray(int[] nums) {
        int n=nums.length;
        long sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }

        long count=0;
        long leftSum=0;
        long rightSum=0;
        for(int i=0;i<n-1;i++){
            leftSum=leftSum+nums[i];
            rightSum=sum-leftSum;

            if(leftSum>=rightSum){
                count++;
            }
        }
        return (int)count;
    
       /* int n=nums.length;
        long [] prefixSum=new long[n];
        long [] suffixSum=new long[n];

        prefixSum[0]=0;
        for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+nums[i-1];
        }

        suffixSum[n-1]=nums[n-1];
        for(int i=n-2;i>=1;i--){
            suffixSum[i]=suffixSum[i+1]+nums[i];
        }

        long count=0;
        for(int i=1;i<n;i++){
            if(prefixSum[i]>=suffixSum[i]){
                count++;
            }
        }
        return (int)count;*/
    }
}