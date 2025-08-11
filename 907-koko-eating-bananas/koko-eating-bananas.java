class Solution {
    public boolean isPossibleToEatBanana(long mid,int [] piles,int h){
        long sum=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]%mid==0){
                sum+=piles[i]/mid;
            }
            else if(piles[i]%mid!=0){
                sum+=(piles[i]/mid)+1;
            }
        }
        //System.out.println("The sum is"+sum);
        return sum<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        long low=1; //atleast she willeat one banana
        long high=Arrays.stream(piles).max().getAsInt(); //at max she can eat max bnana
        long ans=-1;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(isPossibleToEatBanana(mid,piles,h)){
                ans=mid;
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return (int)ans;
    }
}