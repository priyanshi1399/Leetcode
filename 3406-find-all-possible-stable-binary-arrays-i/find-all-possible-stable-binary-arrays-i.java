class Solution {
    public static final int mod=1_000_000_007;
    int [][][] dp= new int [201][201][2];
    public int solve(int zeroesLeft,int onesLeft,int lastOneWasOne,int limit){
        if(zeroesLeft==0 && onesLeft==0){
            return 1;
        }
        if(dp[zeroesLeft][onesLeft][lastOneWasOne]!=-1){
            return dp[zeroesLeft][onesLeft][lastOneWasOne];
        }
        int result=0;

        if(lastOneWasOne==0){
            for(int len=1;len<=Math.min(onesLeft,limit);len++){
                result=(result+solve(zeroesLeft,onesLeft-len,1,limit))%mod;
            }
        }
        else{
            for(int len=1;len<=Math.min(zeroesLeft,limit);len++){
                result=(result+solve(zeroesLeft-len,onesLeft,0,limit))%mod;
            }
        }
        return dp[zeroesLeft][onesLeft][lastOneWasOne]=result;
        
    }
    public int numberOfStableArrays(int zero, int one, int limit) {
          for(int [][] a: dp ){
            for(int [] b:a){
                Arrays.fill(b,-1);
            }
        }
        int onesFollowedByZero=solve(one,zero,0,limit);
        int zeroFollowedByOnes=solve(one,zero,1,limit);
      
        return (onesFollowedByZero+zeroFollowedByOnes)%mod;
    }
}