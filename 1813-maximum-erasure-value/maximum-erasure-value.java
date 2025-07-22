class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        int sum=0;
        int maxSum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int i=0;
        int j=0;
        while(j<n){

            while(i<n && map.containsKey(nums[j])){
                map.remove(nums[i]);
                sum-=nums[i];
                i++;
            }

            map.put(nums[j],j);
            sum+=nums[j];
            maxSum=Math.max(maxSum,sum);
            j++;
        }
        return maxSum;
    }
}