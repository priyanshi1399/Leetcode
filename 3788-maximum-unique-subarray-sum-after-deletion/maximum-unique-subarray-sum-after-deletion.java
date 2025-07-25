class Solution {
    public int maxSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        int maxSum=nums[0];
        Set<Integer> elementSet=new HashSet<>();
        for(int i=0;i<n;i++){
            if(elementSet.contains(nums[i])){
                continue;
            }
            else{
                sum=Math.max(Math.max(sum+nums[i],nums[i]),maxSum);
               maxSum=Math.max(sum,maxSum);
               System.out.println("value of i"+ i + "is" +maxSum);
                elementSet.add(nums[i]);
            }
        }
        return maxSum;
    }
}