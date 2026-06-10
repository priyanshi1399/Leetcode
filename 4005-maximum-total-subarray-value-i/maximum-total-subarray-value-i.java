class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n=nums.length;
        long [] maxArray=new long[n];
        long [] minArray=new long[n];
        long maxElement=Long.MIN_VALUE;
        long minElement=Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            maxArray[i]=Math.max(maxElement,nums[i]);
            maxElement=maxArray[i];
        }
        for(int i=0;i<n;i++){
            minArray[i]=Math.min(nums[i],minElement);
            minElement=minArray[i];
        }
        long maxDifference=Long.MIN_VALUE;

        for(int i=0;i<n;i++){
            maxDifference=Math.max(maxDifference,maxArray[i]-minArray[i]);
        }
        long sum=0;
        while(k-->0){
            sum+=maxDifference;
        }
        return sum;


    }
}