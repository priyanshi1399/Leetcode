class Solution {
    private final int mod=1_000_000_007;
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int [] dp=new int[n+1];
        dp[1]=1; //for 1 people
          long count=0;
        for(int day=2;day<=n;day++){
          //people who becomes eligible to share the secret
            if(day-delay>0){
            count=(count+dp[day-delay])%mod;
            }

            //people who forget moving the window earlier
            if(day-forget>0){
                count=(count-dp[day-forget]+mod)%mod; //a-b%m =(a-b+mod)%mod
            }

            dp[day]=(int)count;


        }

        //calculate the answer
        int result=0;
        for(int day=n-forget+1;day<=n;day++){
            if(day>0){
            result=(result+dp[day])%mod;
            }
        }
        return result;
    }
}