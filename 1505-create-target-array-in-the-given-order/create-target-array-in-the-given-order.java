class Solution {
    public void insertIntoArray(int indexVal,int [] target, int targetValue){
        int t=target.length;
        for(int i=t-2;i>=indexVal;i--){
            target[i+1]=target[i];
        }

        target[indexVal]=targetValue;
        
    }
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int [] target=new int[n];
        for(int i=0;i<n;i++){
            insertIntoArray(index[i],target,nums[i]);
        }

        return target;
    }
}