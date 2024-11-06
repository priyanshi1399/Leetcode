class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> res=new ArrayList<>();
        int start=0;
        int count=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]<target){
                start++;
            }
            else if(nums[i]==target){
                count++;
            }
            i++;
        }
        while(count-->0){
            res.add(start);
            start++;
        }
        return res;
    }
}