class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int count=1;
            if(map.containsKey(nums[i])){
                count=map.get(nums[i])+1;
            }
            map.put(nums[i],count);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>=2){
                return true;
            }
        }
        return false;
    }
}