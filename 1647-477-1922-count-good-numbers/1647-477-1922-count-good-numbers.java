class Solution {
    public static final int mod=1_000_000_007;
    public long exp(long a, long n){
        long ans=1;
        while(n!=0){
            if(n%2==1){
                ans=(ans%mod* a%mod)%mod;
            }
            a=(a%mod*a%mod)%mod;
            n=n/2;
        }
        return ans;
    }
    public int countGoodNumbers(long n) {
        
        long p4=n/2;
        long p5=(n+1)/2;
        
        long res=(exp(5,p5)%mod*exp(4,p4)%mod)%mod;

        return (int)res;
    }
}