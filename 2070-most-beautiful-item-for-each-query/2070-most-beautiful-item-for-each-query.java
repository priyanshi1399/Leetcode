class Solution {

    private int findMaxBeauty(int [][] items, int price){
        int maxBeautyPrice=0;
        int l=0;
        int r=items.length-1;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(items[mid][0]<=price){
                maxBeautyPrice=Math.max(maxBeautyPrice,items[mid][1]); //updating max value
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return maxBeautyPrice;
    }

    public int[] maximumBeauty(int[][] items, int[] queries) {
        int n=queries.length;
        int m=items.length;
        Arrays.sort(items,(a,b)->Integer.compare(a[0],b[0]));

        int maxBeautySeen=items[0][1];
        for(int i=1;i<m;i++){
            maxBeautySeen=Math.max(maxBeautySeen,items[i][1]); 
            items[i][1]=maxBeautySeen; //updating for every then and there only
        }

        int [] res=new int [n];
        for(int i=0;i<n;i++){
            res[i]=findMaxBeauty(items,queries[i]);
        }
        return res;
   /* private int findBeauties(int [][] items,int val){
        int n=items.length;
        int maxPrice=0;
        for(int i=0;i<n;i++){
            if(items[i][0]<=val){
                maxPrice=Math.max(items[i][1],maxPrice);
            }
        }
        return maxPrice;
    }

    public int[] maximumBeauty(int[][] items, int[] queries) {
        int n=queries.length;
        int [] res=new int [n];
        for(int i=0;i<queries.length;i++){
           int p= findBeauties(items,queries[i]);
            res[i]=p;
        }
        return res;*/
        //it will not work
    }
}