class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer> dq=new LinkedList<>(); //taking dequeu to push and pop both from both the side
        int [] ans=new int[n-k+1];
        int index=0;
        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst(); //checking the smaller index and removing it to keep window size of k
            }


            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();//pop till get the greatest element in front
            }

            dq.offerLast(i); //pushing the index 

            if(i>=k-1){ //eliglibe to get element 
                ans[index++]=nums[dq.peekFirst()]; //greatest element will be in front
            }
        }
        return ans;
    }
}