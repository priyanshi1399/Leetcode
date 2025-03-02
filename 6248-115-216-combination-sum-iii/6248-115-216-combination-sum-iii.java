class Solution {
    public void solve(int index,int [] arr ,List<Integer> temp, List<List<Integer>> res,int n,int k){
    if(index==arr.length-1){    
     if(temp.size()==k && n==0 ){
        res.add(new ArrayList<>(temp));
     }
     return;
    }


     if(n<0){
        return;
     }

     temp.add(arr[index]);
     solve(index+1,arr,temp,res,n-arr[index],k);
     temp.remove(temp.size()-1);
     solve(index+1,arr,temp,res,n,k);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int [] arr=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=i+1;
        }
        List<List<Integer>> res=new ArrayList<>();
        if(k>n){
            return res;
        }
        List<Integer> temp=new ArrayList<>();
        solve(0,arr,temp,res,n,k);
        return res;
    }
}