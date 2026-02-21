class Solution {
    public int countPrimeSetBits(int left, int right) {
        boolean [] primes=CalculateSieve(right);
        int count=0;
        for(int i=left;i<=right;i++){
            int countSetBit=Integer.bitCount(i);
            if(primes[countSetBit]==true){

                count++;
            }
        }
        return count;
    }

    public boolean [] CalculateSieve(int n){
        boolean [] sieve=new boolean[n+1];
        Arrays.fill(sieve,true);
        sieve[0]=false;
        sieve[1]=false;
        for(int i=2;i<n;i++){
            if(sieve[i]==true){
            for(int j=i*2;j<n;j=j+i){            
                sieve[j]=false;
            }
            }
        
    }
    return sieve;
    } 
}