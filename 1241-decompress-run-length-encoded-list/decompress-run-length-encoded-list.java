class Solution {
    public void createList(List<Integer> res, int count,int val){
        for(int i=0;i<count;i++){
            res.add(val);
        }
    }
    public int[] decompressRLElist(int[] nums) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n-1;i+=2){
            createList(res,nums[i],nums[i+1]);
        }
        int [] ans=new int[res.size()];
        for(int i=0;i<res.size();i++){
            ans[i]=res.get(i);
        }
        return ans;
    }
}