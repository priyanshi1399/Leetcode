class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost); // 2 2 5 6 7 9
        int sum=0;
        int n=cost.length;
        // for(int i=0;i<n;++i){
        //     if(i%3!=n%3){
        //         sum+=cost[i];
        //     }
        // }
        for(int i=cost.length-1;i>=0;i--){
            if((cost.length-i)%3!=0){
                sum +=cost[i];
            }
        }
        return sum;
    }
}