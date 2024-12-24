class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int [] prefixSum=new int[n+1];
        int minSum=Integer.MAX_VALUE;
        int sum=0;
        prefixSum[0]=0;
        for(int i=0;i<n;i++){
            prefixSum[i+1]=prefixSum[i]+nums.get(i);
        }

        for(int len=l;len<=r;len++){

            for(int i=0;i+len<=n;i++){

                sum=prefixSum[i+len]-prefixSum[i]; 
                if(sum>0){
                minSum=Math.min(minSum,sum);
            }              
            }
          

        }
        return minSum==Integer.MAX_VALUE?-1:minSum;
    }
}