class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }
        int count=0;
        int ans=0;
        while(!pq.isEmpty()){
            ans= pq.poll();
            count++;
            if(count==k){
                break;
            }
        }
        return ans;

    }
}