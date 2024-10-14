class Solution {
    public boolean isPalindrome(int x) {
        if(reverse(x)==x){
            return true;
        }
        else{
            return false;
        }
        
    }

    public int reverse(int x){
        int x1=x;
        int revNum=0;
        while(x1>0){
            int digit=x1%10;
            revNum=revNum*10+digit;
            x1=x1/10;
        }
        return revNum;
    }
}