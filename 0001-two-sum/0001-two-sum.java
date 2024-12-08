class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int secondNum=target-nums[i];
            if(map.containsKey(secondNum)){
                return new int []{map.get(secondNum),i};
            }
            map.put(nums[i],i);
        }
        return null;
       /* int [] res=new int [2];
        for(int i=0;i<=nums.length-2;i++){
            int j=i+1;
            while(j<nums.length){
                if(nums[i]+nums[j]==target){
                    res[0]=i;
                    res[1]=j;
                    break;
                }
                else{
                    j++;
                }

            }
        }
        return res;*/
    }
}