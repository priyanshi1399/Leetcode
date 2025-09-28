class Solution {
    public long splitArray(int[] nums) {
        int n=nums.length;
        long [] prefixSum=new long[n];
        prefixSum[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixSum[i]=nums[i]+prefixSum[i-1];
        }
        //checking valid Split before only
        boolean [] validLeft=new boolean[n];
        validLeft[0]=true;
        for(int i=1;i<n;i++){
           if(nums[i]>nums[i-1] && validLeft[i-1]==true){
            validLeft[i]=true;
           }
        }

        long [] suffixSum=new long[n];
        suffixSum[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffixSum[i]=suffixSum[i+1]+nums[i];
        }

        boolean [] validRight=new boolean[n];
        validRight[n-1]=true;
        for(int i=n-2;i>=0;i--){
           if(nums[i]>nums[i+1] && validRight[i+1]==true){
            validRight[i]=true;
           }
        }

        long diff=Long.MAX_VALUE;
        int leftSum=0;
        for(int i=0;i<n-1;i++){

            if(validLeft[i]==true && validRight[i+1]==true){
                diff=Math.min(diff,Math.abs(prefixSum[i]-suffixSum[i+1]));
            }
        }
        return diff==Long.MAX_VALUE?-1:diff;

        

    }
}