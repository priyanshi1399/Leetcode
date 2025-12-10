class Solution {
    private final int mod=1_000_000_007;
    public long calFact(long n){
        if(n==0 ){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return n*calFact(n-1)%mod;
    }
    public int countPermutations(int[] complexity) {
        int n=complexity.length;
        int val=complexity[0];
        for(int i=1;i<n;i++){
            if(complexity[0]>=complexity[i]){
                return 0;
            }
        }
        int ans=(int)calFact((long)n-1);
        return ans;
    }
}