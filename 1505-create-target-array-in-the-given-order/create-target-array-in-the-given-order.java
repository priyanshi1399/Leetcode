class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++){
             res.add(index[i],nums[i]);
        }
       
        int [] arr=new int[res.size()];
        for(int i=0;i<res.size();i++){
            arr[i]=res.get(i);
        }

    return arr;
    }
}