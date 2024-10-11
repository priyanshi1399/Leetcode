class Solution {

    public int calculateCount(int num){
        int count=0;
        while(num!=0){
            num=num/10;
            count++;
        }
        return count;
    }


    public int calculateSum(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
   
    public int addDigits(int num) {
        while(calculateCount(num)>1){
            num=calculateSum(num);
        }
        return num;
    }

}