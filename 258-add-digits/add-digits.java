class Solution {
    public int findSum(int number){
        int n=number;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            sum+=rem;
        }
        return sum;
    }
    public int addDigits(int num) {

        while(num>9){
            num=findSum(num);
        }
        return num;
       
    }
}