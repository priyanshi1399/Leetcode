class Solution {
  

    public int getSum(int n){
        int sum=0;
        while(n!=0){
            int digit=n%10;
            sum=sum+digit;
            n=n/10;
        }
        return sum;
    }

    public int getProduct(int n){
        int prod=1;
        while(n!=0){
            int digit=n%10;
            prod=prod*digit;
            n=n/10;
        }
        return prod;
    }

    public int subtractProductAndSum(int n) {
    int res=getProduct(n)-getSum(n);
    return res;
        
}
}