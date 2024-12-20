class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer> stck=new Stack<>();
        int [] ans=new int[n];
        for(int i=0;i<n;i++){
            while(!stck.isEmpty() && temperatures[stck.peek()]<temperatures[i]){
                int index=stck.pop();
                ans[index]=i-index;
            }
            stck.push(i);
        }

        return ans;
    /*    int [] answer=new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();
        /*i=0;
        stack=[0];
        answer[0]=1
        stack=[1]
        i=2
        index=1
        answer[1]=2-1
        stack=[2]
        i=3
        stack[2,3]
        i=4
        stack=[2,3,4]
        i=5
        index=4
        answer[4]=5-4=1
        stack=[2,3]
        index=3
        answer[3]=5-3=2
        stack=[2,5]
        i=6
        index=5
        answer[5]=1
        stack[2]
        index=2
        answer=6-2=4
        answer[2]=4
        stack[6]
        i=7
        stack=[6,7]
        */
        /*for(int i=0;i<temperatures.length;i++){
            while(!stack.empty() && temperatures[stack.peek()]<temperatures[i]){
                int index=stack.pop();
                answer[index]=i-index;
            }
            stack.push(i);
        }
        return answer;*/
    }
}