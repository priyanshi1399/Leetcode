class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int maxDist=-1;
        for(int i=0;i<n;i++){
            int j=n-1;
            while(j>=0 && colors[i]==colors[j]){
                j--;

            }
            int dist=Math.abs(i-j);
            maxDist=Math.max(maxDist,dist);
        }
        return maxDist;
    }
}