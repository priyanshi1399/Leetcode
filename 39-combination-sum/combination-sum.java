class Solution {
    public void solve(List<List<Integer>> ans,int [] candidates,int target,List<Integer> temp,int index){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            
        }
        if(target<0){
            return;
        }

        for(int i=index;i<candidates.length;i++){
            temp.add(candidates[i]);
            solve(ans,candidates,target-candidates[i],temp,i);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();

        solve(ans,candidates,target,new ArrayList<>(),0);
        return ans;
    }
}