class Solution {
    public boolean[] subsequenceSumAfterCapping(int[] nums, int k) {
        int n=nums.length;
        boolean [] dp=new boolean [4001];
        boolean [] ans=new boolean[n];
        dp[0]=true; //always possible to make sum 0
        int p=0;
        Arrays.sort(nums);
        for(int i=1;i<=n;i++){
            //values lesser than i
            while(p<n && nums[p]<i){
                for(int j=k;j>=nums[p];j--){
                    //0/1 knpasack whethere its possible to make sum with lesser values than i
                    dp[j]=dp[j] | dp[j-nums[p]];
                }
                p++;
            }
                //numbers which are greater than i
            int cnt=n-p;

            for(int j=0;j<=cnt;j++){
                int weight=i*j;

                if(k<weight){
                    break;
                }
                if(dp[k-weight]){
                    ans[i-1]=true;
                    break; //we can make the sum as k
                }
            }
        }
        return ans;

    }
}