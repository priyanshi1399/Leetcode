class Solution {
    public int countPrimes(int n) { //Sieve of Eratosthenes
       int count=0;
        boolean [] isPrime=new boolean[n];
        for(int i=0;i<n;i++){
            isPrime[i]=true;
        }
        if(n<=2){
            return 0;
        }
        for(int i=2;i<n;i++){
            if(isPrime[i]){
                count++;
                for(int j=i*2;j<n;j=j+i){
                    isPrime[j]=false;
                }
            }           
        } 
        return count;
   /* int count=0;
    if(n<=2){
        return 0;
    } //n=20
    boolean[] isPrime=new boolean[n];
    for(int i=0;i<n;i++){
        isPrime[i]=true;
    } 
    for(int i=2;i<n;i++){
        if(isPrime[i]){
            count++;
            for(int j=i*2;j<n;j=j+i){ //4+2;6+2
                isPrime[j]=false;
            }
        }
    }
    return count;*/
    }
}