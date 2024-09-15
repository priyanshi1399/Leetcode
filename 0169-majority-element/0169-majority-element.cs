public class Solution {
    public int MajorityElement(int[] nums) {
         int cnt=0;
        int n=nums.Length;
        Array.Sort(nums);
        if(n==1){
            return nums[0];
        }
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                cnt++;
                if(cnt>=n/2){
                    return nums[i];
                }
            }
        }
        return 0;
    }
}