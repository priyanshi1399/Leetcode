class Solution {
    public List<Integer> getRow(int rowIndex) {
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
}