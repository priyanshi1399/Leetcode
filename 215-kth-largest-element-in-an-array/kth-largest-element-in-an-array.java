class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:nums){
            pq.add(num);
            while(pq.size()>n-k+1){
                    pq.poll();
                }
        }
        return pq.peek();
    }
}