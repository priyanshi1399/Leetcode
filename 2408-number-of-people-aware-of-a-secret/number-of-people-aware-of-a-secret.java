class Solution {
    private final int mod=1_000_000_007;
    public int solve(int day, int forget,int delay,int [] dp){
        if(day==1){
            return 1; //only 1 person knows the secret
        }
          if(dp[day]!=-1){
            return dp[day];
        }
        
      
        long result=0;
        for(int prev=day-forget+1;prev<=day-delay;prev++){ //nth day  how nmany people knows the secret
        // try out by chceking day-1 to day-6
            if(prev>0){ //should not be negative
                result=(result+solve(prev,forget,delay,dp))%mod;
            }
        }
        return dp[day]=(int)result;
    }
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int total=0;
        int [] dp=new int[n+1];
        Arrays.fill(dp,-1);
        for(int day=n-forget+1;day<=n;day++){
            if(day>0){
            total=(total+solve(day,forget,delay,dp))%mod; //we are calculating the previous problem
            }
        }

        return total;
    }
}