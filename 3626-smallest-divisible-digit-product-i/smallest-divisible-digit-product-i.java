class Solution {
    public int checkingProd(int num){
        int prod=1;
        while(num>0){
            int rem=num%10;
            prod*=rem;
            num=num/10;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        int i=n;
        while(i>=n){
            int prod=checkingProd(i);
        if(prod%t==0){
            break;
        }
        i++;
        }
        return i;

    }
}