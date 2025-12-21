class Solution {
    public long minCost(String s, int[] cost) {
        long sum=0L;
        int n=cost.length;
        long[] count=new long[26];
        for(int i=0;i<n;i++){
            count[s.charAt(i)-'a']+=cost[i];
            sum+=cost[i];
        }
        long maxEle=0;
        for(int i=0;i<26;i++){
            maxEle=Math.max(maxEle,count[i]);
        }
        return sum-maxEle;
    }
}