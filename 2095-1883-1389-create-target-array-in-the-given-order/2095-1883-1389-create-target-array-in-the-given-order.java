class Solution {

    public int[] createTargetArray(int[] nums, int[] index) {
      ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            res.add(index[i],nums[i]);
        }
        int [] target=new int[res.size()];
        for(int i=0;i<res.size();i++){
            target[i]=res.get(i);
        }
        return target;

    /*public int shiftTargetArrayValues(int [] target,int value,int index){ 
        int t=target.length;
        for(int i=t-1;i>index;i--){
            target[i]=target[i-1];
        }
        target[index]=value;
        return target[index];
    }

    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int [] target=new int[n];   

        for(int i=0;i<n;i++){
                target[index[i]]=shiftTargetArrayValues(target,nums[i],index[i]);
            }
        return target;*/

    }
}