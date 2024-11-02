class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> lst =new ArrayList<>();
        int prefix=0;
        for(int i=0;i<nums.length;i++){
            prefix= ((prefix<<1) | nums[i]);
            prefix=prefix%5;
            if(prefix==0){
                lst.add(true);
            }
            else{
                lst.add(false);
            }
        }
         return lst;
    }
}