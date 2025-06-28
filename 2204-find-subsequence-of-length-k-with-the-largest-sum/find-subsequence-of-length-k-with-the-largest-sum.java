class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n=nums.length;
        int [] newArray=new int[n];
        for(int i=0;i<n;i++){
            newArray[i]=nums[i];
        }
        Arrays.sort(newArray);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=n-k;i<n;i++){
            map.put(newArray[i],map.getOrDefault(newArray[i],0)+1);
        }

        int idx=0;
        int [] ans=new int[k];
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i]) && map.get(nums[i])>0){
                map.put(nums[i],map.get(nums[i])-1);
                ans[idx]=nums[i];
                idx++;
            }
        }
        return ans;
    }
}