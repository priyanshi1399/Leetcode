class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            if(nums[i]%2!=0){
                nums[i]=1;
            }
            else{
                nums[i]=0;
            }
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
            if(map.containsKey(sum-k)){
                ans=ans+map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
    return ans;
        

    }
}