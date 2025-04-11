class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int num=low;num<=high;num++){
            if(num>=11 && num<=100 && num%11==0){
                count++;
            }
            else if(num>=1000 && num<=9999){
                int firstDigit=num/1000;
                int secondDigit=(num/100)%10;
                int thirdDigit=(num/10)%10;
                int fourthDigit=(num/1)%10;
                if(firstDigit+secondDigit==thirdDigit+fourthDigit){
                    count++;
                }
            }
        }
        return count;
    }
}