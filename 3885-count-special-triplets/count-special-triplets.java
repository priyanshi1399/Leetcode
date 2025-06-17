class Solution {
    private final int mod=10_00_00_0007;
    public int specialTriplets(int[] nums) {
        
        Map<Integer,Integer> rightMap=new HashMap<>();
        Map<Integer,Integer> leftMap=new HashMap<>();
        int n=nums.length;
        for(int num: nums){
            rightMap.put(num,rightMap.getOrDefault(num,0)+1);
        }
        long count=0;
        for(int j=0;j<n;j++){
            int mid=nums[j];

            rightMap.put(mid,rightMap.get(mid)-1);

            int target=mid*2;

            long leftCount=leftMap.getOrDefault(target,0);
            long rightCount=rightMap.getOrDefault(target,0);

            count=(count+(leftCount*rightCount))%mod;

            leftMap.put(mid,leftMap.getOrDefault(mid,0)+1);
        }
        return (int)count;
    }
}