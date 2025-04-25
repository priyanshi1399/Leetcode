class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n=nums.length;
        int count=0;
        Set<Integer> totalDistinct=new HashSet<>();
        for(int i=0;i<n;i++){
            totalDistinct.add(nums[i]);
        }
        int distinctElements=totalDistinct.size();
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0,j=0;
        while(j<n){
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);

            while(i<n && map.size()==distinctElements){
                map.put(nums[i],map.get(nums[i])-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                count+=n-j;
                i++;
            }
            j++;
        }
        return count;
    }
}