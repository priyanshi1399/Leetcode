class Solution {
    private boolean isPossibleToEat(int [] piles,int mid,int h){
        int n=piles.length;
        long sum=0;
        for(int pile:piles){
            sum+=pile/mid;
            if((pile%mid)!=0){
                sum++;
            }
        }
        return sum<=h;
       
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=Arrays.stream(piles).max().getAsInt();
        int result=-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossibleToEat(piles,mid,h)){
            result=mid;
            r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        System.out.println(isPossibleToEat(piles,2,h));
        return result;
    }
}