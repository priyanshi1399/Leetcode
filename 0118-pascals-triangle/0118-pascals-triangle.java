class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lst=new ArrayList<>();
        int ans=1;
        for(int row=1;row<=numRows;row++){

            List<Integer> tempList=new ArrayList<>();
            tempList.add(ans);
            for(int col=1;col<row;col++){
                ans=ans*(row-col);
                ans=ans/col;
                tempList.add(ans);
            }
            lst.add(tempList);
        }
    
    return lst;
    }
}