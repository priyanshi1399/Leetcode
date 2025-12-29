class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> result=new ArrayList();
        for(int i=0;i<=n-3;i++){
             if(i>0  && nums[i-1]==nums[i]){
                continue;
            }
            int j=i+1;
            int k=n-1;
            while(j<k){
               
                if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }
                else if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }
                else{
                    result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                while(j<k && nums[j]==nums[j+1]){
                    j++;
                }
                while(j<k && nums[k]==nums[k-1]){  
                    k--;
                }
                 j++;
                k--;
                }
                
               
            }
           
        }
        return result;
    }
}
//[-4,-1,-1,0,1,2]
//       j       k



//[-2,0,1,1,2]
/*
    0 1 2 3 4
    i   j k  =0
    */