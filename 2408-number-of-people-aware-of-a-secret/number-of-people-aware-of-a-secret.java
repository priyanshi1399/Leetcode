class Solution {
    private final int mod=1_000_000_007;
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int [] dp=new int[n+1];
        dp[1]=1; //for 1 people
        for(int day=2;day<=n;day++){
            long count=0;
            for(int prev=day-forget+1;prev<=day-delay;prev++){
                if(prev>0){
                count=(count+dp[prev])%mod;
                }
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