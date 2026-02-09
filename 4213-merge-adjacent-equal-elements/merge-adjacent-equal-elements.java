class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> stck=new Stack<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            long sum=nums[i];
            while(!stck.isEmpty() && (stck.peek()==sum)){
                    sum+=stck.pop();
                    
                }
             
            
                stck.push(sum);
            
        }

        List<Long> ans=new ArrayList<>();
        while(!stck.isEmpty()){
            ans.add(0,stck.pop());
        }
        return ans;


    }
}