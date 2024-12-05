class Solution {

    private int CountNumberOfBouquets(int [] bloomDay,int mid,int m,int k){
        int countBouquet=0; //no of bouquet
        int countFlower=0; //no of adjacent flower that are not part of bouquet
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){ //example 7<=8 that means on 7th day flower has bloomed
                countFlower++;
            }
            else{
                countFlower=0;
            }
            if(countFlower==k){
                countBouquet++;
                countFlower=0; //resetting for next batch of flower
            }
        }
        return countBouquet;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<1L*m*k){
            return -1;
        }
        int l=Arrays.stream(bloomDay).min().getAsInt();
        int h=Arrays.stream(bloomDay).max().getAsInt();
        while(l<h){
            int mid=l+(h-l)/2;
            if(CountNumberOfBouquets(bloomDay,mid,m,k)<m){
                l=mid+1;
            }
            else{
                h=mid;
            }
        }
        return l;
    }
}
//0(log(max)) ==>0(log(p))*0(n)==>p is maximum element in array
//n is element in array