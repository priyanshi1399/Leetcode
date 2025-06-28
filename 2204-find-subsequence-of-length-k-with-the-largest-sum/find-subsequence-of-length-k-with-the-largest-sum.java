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
        Map<Integer,Integer> map=new TreeMap<>();
        while(!pq.isEmpty()){
            int [] curr=pq.poll();
            map.put(curr[1],curr[0]);
        }

        int [] ans=new int[k];
        int idx=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            ans[idx]=nums[entry.getKey()];
            idx++;
        }
        return ans;
    }
}