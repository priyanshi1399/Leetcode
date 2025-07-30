class Solution {
    public int longestSubarray(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int n=nums.length;
        int maxVal=nums[0];

        int maxLength=1;
        int i=0;
        int j=0;
        while(i<n){
            if(nums[i]>=maxVal){
           
                maxVal=nums[i];
                System.out.println(maxVal);
                 j=i;
                while(j<n && nums[j]==maxVal){
                    j++;
                }
                
                if(set.contains(maxVal)){
                maxLength=Math.max(maxLength,j-i);
                }
                else{
                    maxLength=j-i;
                }
                set.add(nums[i]);
                i=j;
                
            }
            else{
                i++;
            }
           
        }
        return maxLength;
    }
}