 class Solution {
    public int distributeCandies(int n, int limit) {
    int count=0;
        for(int ch1=0;ch1<=limit;ch1++){
            for(int ch2=0;ch2<=limit;ch2++){
               int ch3=n-ch1-ch2;
               if(ch3>=0 && ch3<=limit){
                count++;
               }
            }
        }
        return count;
    }
}