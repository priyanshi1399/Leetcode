class Solution {

    public void shiftingArray(int [] target,int value,int index){
        int t=target.length;
        for(int i=t-1;i>index;i--){
            target[i]=target[i-1];
        }
        target[index]=value;
    }


    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int [] target=new int[n];
        for(int i=0;i<n;i++){
            shiftingArray(target,nums[i],index[i]);
        }
        return target;


       /* ArrayList<Integer> target=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            target.add(index[i],nums[i]);
        }
        int [] res=new int[target.size()];
        for(int i=0;i<res.length;i++){
            res[i]=target.get(i);
        }
        return res;*/
    }
}