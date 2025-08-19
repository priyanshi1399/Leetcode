class Solution {
    public void backtrack(int idx,int k,int n,List<Integer> combinationSize,List<List<Integer>> res){
        if(n==0 && combinationSize.size()==k){
            res.add(new ArrayList<>(combinationSize));
            return;
        }


        for(int i=idx;i<=9;i++){
            if(i>n || n<0 || combinationSize.size()>k){
                break;
            }
            combinationSize.add(i);
            backtrack(i+1,k,n-i,combinationSize,res);
            combinationSize.remove(combinationSize.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(1,k,n,new ArrayList<>(),res);
        return res;
    }
}