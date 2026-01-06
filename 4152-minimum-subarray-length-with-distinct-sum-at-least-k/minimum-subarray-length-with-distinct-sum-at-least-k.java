class Solution {
    public int minLength(int[] nums, int k) {
        int i=0;
        int j=0;
        int n=nums.length;
        int sum=0;
        int minLength=Integer.MAX_VALUE;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(j<n){
            if(nums[j]>=k){
                return 1;
            }
           
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);

            if(map.get(nums[j])==1){
                 sum+=nums[j];
            }

            while( sum>=k){
                map.put(nums[i],map.getOrDefault(nums[i],0)-1);
                minLength=Math.min(minLength,j-i+1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                     sum-=nums[i];
                }
                    i++;
                     
         
                }
               
           // System.out.println(sum);
            

            j++;
        }
        return minLength!=Integer.MAX_VALUE?minLength:-1;
    }
}