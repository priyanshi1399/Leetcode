class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int [] ans=new int[2];
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){ //finding its compliment
                    ans[0]=i;
                    ans[1]=map.get(target-nums[i]);
                    break;
            }
            map.put(nums[i],i); //putting number and index
        }
    return ans;

    }
}