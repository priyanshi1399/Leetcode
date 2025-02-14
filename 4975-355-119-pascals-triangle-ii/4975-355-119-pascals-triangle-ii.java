class Solution {
    public int nCr(int n,int r){
        long ans=1;
        for(int i=0;i<r;i++){
            ans=ans*(n-i);
            ans=ans/(i+1);
        }
        return (int)ans;
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<>();
        for(int col=0;col<=rowIndex;col++){
            res.add(nCr(rowIndex,col));
        }
        return res;

    }
}
  /*  public List<Integer> getRow(int rowIndex) {
        List<Integer> ans= new ArrayList<>();
        ans.add(1);
        long res=1;
        for(int i=0;i<rowIndex;i++){
            res=res*(rowIndex-i);
            res=res/(i+1);
            ans.add((int)res);
        }
        return ans;

    }
}*/