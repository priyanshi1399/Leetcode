class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(nums[i]==key){
                for(int j=i-k;j<=i+k;j++){
                    if(j>=0 && j<=n-1){
                        set.add(j);
                    }
                }
            }
        }
        List<Integer> arr=new ArrayList<>();
        for(int num:set){
            arr.add(num);
        }
        Collections.sort(arr);
        return arr;
    }
}