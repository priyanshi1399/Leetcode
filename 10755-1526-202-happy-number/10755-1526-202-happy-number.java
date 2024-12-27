class Solution {
 /*
        20->4->16->37-->58-->89-->145-->42-->20
        A cycle is detected

        */
        /* 
        n=19
        n%10
        sum=81
        n=n/10
        n=1
        n%10=1
        sum=81+1=82
        n=192
        sum=0
        n%10=2
        sum=4
        n=n/10=19
        n=n%10=9
        sum=4+81=85
        n=n/10=1
        sum=85+1
        */
     public int sumOfSquraes(int n){
        int sum=0;
        while(n>0){
        int rem=n%10;
        sum=sum+(rem)*(rem);
        n=n/10;
     }
     return sum;
     }

    public boolean isHappy(int n) {
        int slow=sumOfSquraes(n);
        int fast=sumOfSquraes(sumOfSquraes(n));

        while(slow!=fast && fast!=1){
        slow=sumOfSquraes(slow);
        fast=sumOfSquraes(sumOfSquraes(fast));
    }
    return (fast==1);
}
}