class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        int startIndex=0;
        int ansStart=0;
        int endIndex=0;
        for(int i=0;i<n;i++){
    
            if(sum<0){
                sum=0;
                startIndex=i+1<n?i+1:i; //additional if asked to print the range
            }
            sum+=nums[i];
            if(sum>maxSum){
                maxSum=sum;
                ansStart=startIndex;
                endIndex=i;
            }
        }
        System.out.println("Starting array Index is"+ ansStart +"ending array Index"+endIndex);
        return maxSum;
    }
}