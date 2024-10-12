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
private int sumOfSquares(int n){
    //192
    /*Ex-256
    sum=36
    n=256/10
    sum=36+25=61
    n=25/10=2
    sum=4+61=65
    */

    int sum=0;
    while(n>0){
        int remainder=n%10;
        sum=sum+(remainder*remainder);
        n=n/10;
    }
    return sum;
}

    public boolean isHappy(int n) { 
        int slow=sumOfSquares(n);
        int fast=sumOfSquares(sumOfSquares(n));

        while(slow!=fast && fast!=1){
            slow=sumOfSquares(slow);
            fast=sumOfSquares(sumOfSquares(fast));
        }
        return fast==1; //fast will reach 1 before slow
    }
}