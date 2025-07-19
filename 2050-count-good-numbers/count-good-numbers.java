class Solution {
    private final long mod=100_00_00_007;
    public long findPower(long a,long b){
        if(b==0){
            return 1;
        }

        long half=findPower(a,b/2);
        long result=(half%mod*half%mod)%mod;

        if(b%2==1){
            result=a*result;
        }
        return result;
    }
    public int countGoodNumbers(long n) {
        long p4=n/2;
        long p5=(n+1)/2;

        long res=(findPower(4,p4)%mod*findPower(5,p5)%mod)%mod;
        return (int)res;
    }
}