class Solution {
    public int leastToShipinDays(int mid,int [] weights,int days){
         System.out.println("mid value is"+mid);
        int countDays=1;
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
            if(sum>mid){
                countDays++;
                sum=weights[i];
            }
        }
        return countDays;

    }
    public int shipWithinDays(int[] weights, int days) {
        int low=Arrays.stream(weights).max().getAsInt();
        int high=Arrays.stream(weights).sum();
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(leastToShipinDays(mid,weights,days)<=days){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}