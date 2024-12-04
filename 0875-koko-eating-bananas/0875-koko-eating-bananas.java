class Solution {
   /* private int calculateHours(int [] piles, int mid){
        int sum=0;
        for(int i=0;i<piles.length;i++){         
           int res = (int)Math.ceil((double)piles[i]/mid);
            sum=sum+res;
        }
        System.out.println(sum);
        return sum;
    }*/

    private int calculateHours(int [] piles, int mid){
        int sum=0;
        for(int i=0;i<piles.length;i++){         
          if(piles[i]%mid==0){
            sum+=piles[i]/mid;
          }
          else{
            sum+=piles[i]/mid+1;
          }
        }
        return sum;
    }

    public int minEatingSpeed(int[] piles, int h) {
      
        int l=1;
        int r=Arrays.stream(piles).max().getAsInt();
        while(l<r){
            int mid=l+(r-l)/2;
            int totalHours=calculateHours(piles,mid);
            if(totalHours<=h){
                r=mid;
            }
            else{
                l=mid+1;
            }
        }
        return l;

        
    }
}