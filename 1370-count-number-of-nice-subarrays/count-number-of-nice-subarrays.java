class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int result=0;
        int sum=0;
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,1); // taken 1 for 0 odd subarray //take ex {1,2}
        for(int i=0;i<n;i++){
            sum+=nums[i]%2; //if odd add 1 if even add 0

            if(map.containsKey(sum-k)){
                result+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);

        }
        return result;
    }
}