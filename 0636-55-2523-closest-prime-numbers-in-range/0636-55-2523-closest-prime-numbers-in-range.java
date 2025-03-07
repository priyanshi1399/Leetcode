class Solution {
    private boolean isPrime(int n){
            if(n<2){
                return false;
            }

            for(int div=2;div*div<=n;div++){
                if(n%div==0){
                    return false;
                }
            }
            return true;
        }
        public int[] closestPrimes(int left, int right) {
        List<Integer> primeList=new ArrayList<>();
        for(int num=left;num<=right;num++){
            if(isPrime(num)==true){
                if(!primeList.isEmpty() && num-primeList.get(primeList.size()-1)<=2){
                    return new int[]{primeList.get(primeList.size()-1),num};
                }
                primeList.add(num);
            }
        }

        int minValue=Integer.MAX_VALUE;
        int [] result=new int[]{-1,-1};
        for(int i=1;i<primeList.size();i++){
            int diff=primeList.get(i)-primeList.get(i-1);
            if(diff<minValue){
                minValue=diff;
                result[0]=primeList.get(i-1);
                result[1]=primeList.get(i);
            }
        }
        return result;
    }
    /*
       public boolean [] SeiveOfPrime(int n ){
       boolean[] isPrime=new boolean[n+1];
       Arrays.fill(isPrime,true);
       isPrime[0]=false;
       isPrime[1]=false;
       for(int i=2;i<=n;i++){
           if(isPrime[i]){
            for(int j=i*2;j<=n;j=j+i){
                isPrime[j]=false;
            }
           }
       }
    return isPrime;
    }
    public int[] closestPrimes(int left, int right) {
       List<Integer> primeList=new ArrayList<>();
       boolean [] primeNumber =SeiveOfPrime(right);
        for(int i=left;i<=right;i++){
           if(primeNumber[i]){
            primeList.add(i);
           }
        }

        for(int i=0;i<primeList.size();i++){
           System.out.println(primeList.get(i));
        }
        
        if(primeList.size()<2){
            return new int []{-1,-1};
        }
       int len=primeList.size();
    int minValue=Integer.MAX_VALUE;
    int [] result=new int[2];
    for(int i=1;i<len;i++){
        int diff=primeList.get(i)-primeList.get(i-1);
            if(diff<minValue){
                minValue=diff;
                result[0]=primeList.get(i-1);
                result[1]=primeList.get(i);
            }
    }
    return result;
    }
    */
}