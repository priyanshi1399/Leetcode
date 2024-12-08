class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int windowSum=0;
        double maxSum=0;
        for(int i=0;i<k;i++){
            windowSum=windowSum+nums[i];
        }
        maxSum=windowSum;
        for(int i=k;i<n;i++){
            windowSum=windowSum+nums[i]-nums[i-k];
            maxSum=Math.max(maxSum,windowSum);
        }
        return maxSum/k;

        /*int n=nums.length;
        double maxSum=Integer.MIN_VALUE;
        int i=0;
        if(k>100){
        k=k%n;
        }
        
        while(i<=n-k){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum=sum+nums[j];
            }
            maxSum=Math.max(sum,maxSum);
            System.out.println(maxSum);
            i++;
        }
        return maxSum/k; This solution was Time limit exceeded*/

    }
}