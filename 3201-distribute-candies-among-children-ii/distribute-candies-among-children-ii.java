class Solution {
    public long distributeCandies(int n, int limit) {
        int minCh1=Math.max(0,n-2*limit); // distributed limit ,limit to 2 children and left n-2*limit
        int maxCh1=Math.min(n,limit); //because candies can't be in negative
        long ways=0;
        for(int x=minCh1;x<=maxCh1;x++){
            int N=n-x; //distribute x to child1 left n-x assigned it to N
            int minCh2=Math.max(0,N-limit); // we can give it to max 0 or N-limit, we can't give negative candies.
            int maxCh2=Math.min(limit,N);

            ways+=maxCh2-minCh2+1;
        }
        return ways;

    }
}