class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque <Integer> dq=new LinkedList<>();
        int k1=0;
        int [] res=new int[n-k+1];
        for(int i=0;i<nums.length;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k) {//if spomething is less outside the window
            dq.pollFirst();
        }

        while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
            dq.pollLast();
        }

        dq.offerLast(i);

        if(i>=k-1){
            res[k1++]=nums[dq.peekFirst()];
        }
        }

    return res;
    }
}