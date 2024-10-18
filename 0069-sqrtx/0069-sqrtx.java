class Solution {
    //related to Binary Search
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        long low=1;
        long high=x; //return high or ans  at last
        while(low<=high){
           long mid=(low+high)/2;
           long val=(mid*mid);
            if(val<=x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return (int)high;
    }
}