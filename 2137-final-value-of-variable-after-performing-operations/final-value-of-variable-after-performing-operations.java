class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int n=operations.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(operations[i].equals("X--") || (operations[i].equals("--X"))){
                    ans-=1;
            }
            else if(operations[i].equals("X++") || operations[i].equals("++X")){
                ans+=1;
            }
        }
        return ans;
    }
}