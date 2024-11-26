class Solution {
    public int minCostToMoveChips(int[] position) {
        int n=position.length;
        int count1=0;
        int count2=0;
        for(int i=0;i<n;i++){
            if(position[i]%2==0){
                count1++;
            }
            else{
                count2++;
            }
        }
        return Math.min(count1,count2);
    }
}