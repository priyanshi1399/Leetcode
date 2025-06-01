 class Solution {
    public int distributeCandies(int n, int limit) {
    int count=0;
        for(int ch1=0;ch1<=limit;ch1++){
            for(int ch2=0;ch2<=limit;ch2++){
                for(int ch3=0;ch3<=limit;ch3++){
                    if(ch1+ch2+ch3==n){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}