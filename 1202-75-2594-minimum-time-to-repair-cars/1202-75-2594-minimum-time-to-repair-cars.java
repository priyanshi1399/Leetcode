class Solution {
    private boolean isPossibleToRepair(int [] ranks, int cars, long mid){
        int n=ranks.length;
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.sqrt(mid/ranks[i]);
        }
        return sum>=cars;
    }
    public long repairCars(int[] ranks, int cars) {
        long l=1;
        int maxC=Arrays.stream(ranks).max().getAsInt();
        long r=1L*maxC*cars*cars;
        long result=-1;
        while(l<=r){
            long mid=l+(r-l)/2;
            if(isPossibleToRepair(ranks,cars,mid)){
                result=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return result;
    }
}