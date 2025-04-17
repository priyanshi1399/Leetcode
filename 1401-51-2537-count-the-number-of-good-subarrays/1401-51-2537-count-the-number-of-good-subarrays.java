class Solution {
    public long countGood(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int j=0;
        int pairs=0;
        long result=0;
        Map<Integer,Integer> map=new HashMap<>();
        while(j<n){
            if(map.containsKey(nums[j])){
            pairs+=map.get(nums[j]);
            }
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            while(pairs>=k){
                result+=n-j;
                map.put(nums[i],map.get(nums[i])-1);             
                pairs-=map.get(nums[i]);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
                
            }
            j++;
        }
        return result;
    }
}