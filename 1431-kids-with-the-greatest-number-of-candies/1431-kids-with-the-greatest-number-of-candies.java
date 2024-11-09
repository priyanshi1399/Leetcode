class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res=new ArrayList<>();
        int n=candies.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,candies[i]);
        }
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}