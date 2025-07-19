class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(b[1],a[1]));
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            pq.add(new int[]{entry.getKey(),entry.getValue()}); //it will be having the highest value at the top
        }
        int index=0;
        int [] res=new int[k];
        while(k-->0){
            int [] curr=pq.poll();
            res[index]=curr[0];
            index++;
        }
        return res;
    }
}