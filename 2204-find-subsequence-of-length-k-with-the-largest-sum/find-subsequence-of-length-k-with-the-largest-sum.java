class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n=nums.length;
        PriorityQueue<int [] > pq=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<n;i++){
            pq.add(new int []{nums[i],i});
            while(pq.size()>k){
                pq.poll();
            }
        }
        
        PriorityQueue<Integer> pq2=new PriorityQueue<>();
        while(!pq.isEmpty()){
            pq2.add(pq.poll()[1]);
        }
        int idx=0;
        int [] ans=new int[k];
        while(!pq2.isEmpty()){
            ans[idx]=nums[pq2.poll()];
            idx++;
        }
        return ans;

    }
}