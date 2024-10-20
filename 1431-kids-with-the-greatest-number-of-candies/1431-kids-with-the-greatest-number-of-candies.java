class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        int res=Integer.MIN_VALUE;
        int n=candies.length;
        for(int i=0;i<n;i++){
            res=Math.max(res,candies[i]);           
        }
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=res){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;

    }
}