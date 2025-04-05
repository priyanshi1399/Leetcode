class Solution {
    public void solve(int [] nums,int  index, List<Integer> temp,List<List<Integer>> result,int n){
        if(index>=n){
            result.add(new ArrayList<>(temp));
            return;
        }
        
        temp.add(nums[index]);
        solve(nums,index+1,temp,result,n);
        temp.remove(temp.size()-1);
        solve(nums,index+1,temp,result,n);
        }
    public int subsetXORSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> result=new ArrayList<>();
        solve(nums,0,new ArrayList<>(),result,n);
        int ans=0;
        for(List<Integer> lists: result){
            int XOR=0;
            for(int i=0;i<lists.size();i++){
                XOR=XOR^lists.get(i);
            }
            ans+=XOR;
        }
        return ans;

    }
}