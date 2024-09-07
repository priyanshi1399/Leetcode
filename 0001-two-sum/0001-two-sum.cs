public class Solution {
 
    public int[] TwoSum(int[] nums, int target) {
        int [] Result=new int[2];
        for(int i=0;i<nums.Length;i++)
        {
            for(int j=i+1;j<nums.Length;j++){
                if(nums[i]+nums[j]==target){
                    Result[0]=i;
                    Result[1]=j;
                }
            }

            }
            return Result;
        }
}