class Solution {

    public List<Integer> generateRows(int n){
    List<Integer> ans= new ArrayList<>();
    int res=1;
    ans.add(1);
    for(int i=1;i<n;i++){
        res=res*(n-i);  //1*(5-1) =4 , i=2  4*( 1*5)=>4*5
        res=res/(i);  //4/1 =>4=> 20/2
        ans.add(res); 
    }
    return ans;
    }
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> res=generateRows(i);
            ans.add(res);
        }
        return ans;
    }
}
    /*public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<numRows;i++){
           List<Integer> row =new ArrayList<>(i+1);
           for(int j=0;j<=i;j++){
            if(j==0 || j==i){
                row.add(1);
            }
            else{
                int num=res.get(i-1).get(j) +res.get(i-1).get(j-1);
                row.add(num);
            }
           }
           res.add(row);
        }
        return res;
    }
}*/