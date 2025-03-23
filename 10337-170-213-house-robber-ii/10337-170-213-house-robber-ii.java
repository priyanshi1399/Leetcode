class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int [] dp=new int[n+1];

        //take 1st house skip last house
        dp[0]=0;
        for(int i=1;i<=n-1;i++){ //take strating house  do not take last
            int include=nums[i-1]+(i-2>=0?dp[i-2]:0);
            int exclude=dp[i-1];

            dp[i]=Math.max(include,exclude);
        }
        int result1=dp[n-1];
        
        //take 2nd house take last one then
        
        Arrays.fill(dp,0);
        dp[0]=0;
        dp[1]=0; //skipping first house iske liye 1 consider karenge
         for(int i=2;i<=n;i++){ //take strating house  do not take last
            int include=nums[i-1]+(i-2>=0?dp[i-2]:0);
            int exclude=dp[i-1];

            dp[i]=Math.max(include,exclude);
        }
        int result2=dp[n];

        return Math.max(result1,result2);
    }
}