class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        int op=0;
        int i=0;
        while(i<n){
            int j=i;
            HashMap<Integer,Integer> map=new HashMap<>();
            while(j<n){
                map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                if(map.get(nums[j])>1){
                    op++;
                    break;
                }
                else{
                    j++;
                }
            }
            i=i+3;
        }
        return op;
    }
}