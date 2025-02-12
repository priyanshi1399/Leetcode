class Solution {
    public int findSum(int num){
        int sum=0; 
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int maxSum=-1;
        for(int i=0;i<n;i++){
            int value=findSum(nums[i]);
            if(map.containsKey(value)){
                int prev=map.get(value);
                maxSum=Math.max(maxSum,prev+nums[i]);
                map.put(value,Math.max(prev,nums[i]));
            }
            else{
            map.put(value,nums[i]);
            }
        }
    return maxSum;
    }  
    } 

