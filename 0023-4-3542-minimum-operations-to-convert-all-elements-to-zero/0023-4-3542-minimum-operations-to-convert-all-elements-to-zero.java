class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> stck=new Stack<>();
        stck.push(0);
        int op=0;
        for(int n:nums){
            while(!stck.isEmpty() && stck.peek()>n){
                stck.pop();
            }

            if(!stck.isEmpty() && stck.peek()<n){
                stck.push(n);
                op++;
            }
        }
        return op;
    }
}