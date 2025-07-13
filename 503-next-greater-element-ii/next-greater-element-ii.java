class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int [] res=new int[n];
        Arrays.fill(res,-1);
        Stack<Integer> stck=new Stack<>();
        for(int i=2*n-1;i>=0;i--){
             while(!stck.isEmpty() && nums[stck.peek()]<=nums[i%n]){
                stck.pop();
             }
             
                    if(!stck.isEmpty()){
                        res[i%n]=nums[stck.peek()];
                    }
             
             stck.push(i%n);

        }
        return res;


    }
}


