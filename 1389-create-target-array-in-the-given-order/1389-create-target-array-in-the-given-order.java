class Solution {

    public void Solve(int [] target,int value,int index){
        int t=target.length;
        for(int i=t-1;i>index;i--){
            target[i]=target[i-1];
        }
        target[index]=value;
    }


    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int [] target=new int[n];
        for(int i=0;i<nums.length;i++){
            Solve(target,nums[i],index[i]);
        }
    return target;
    }


        /*int n=nums.length;
        int [] res=new int[n];
        List<Integer> lst=new ArrayList<>();
        for(int i=0;i<n;i++){
        lst.add(index[i],nums[i]);
        }

        for(int i=0;i<lst.size();i++){
            res[i]=lst.get(i);
        }
        return res;*/

}