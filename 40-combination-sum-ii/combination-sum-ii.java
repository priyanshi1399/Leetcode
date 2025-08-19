class Solution {
    int n;
    public void solve(int idx,int [] candidates, int target,List<Integer> temp,List<List<Integer>> res){
            if(target==0){
                res.add(new ArrayList<>(temp));
                return;
            }
           


       for(int i=idx;i<n;i++){
        if(i>idx && candidates[i]==candidates[i-1]){
            continue;
        }
        if(candidates[i]>target){ //we can't pick even rightmost to it 
            break;
        }
        temp.add(candidates[i]);
        solve(i+1,candidates,target-candidates[i],temp,res);
        temp.remove(temp.size()-1);
       }
    }
    


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        n=candidates.length;
        Arrays.sort(candidates);
        List<List<Integer>> res=new ArrayList<>();
        solve(0,candidates,target,new ArrayList<>(),res);
        return res;
    }
}