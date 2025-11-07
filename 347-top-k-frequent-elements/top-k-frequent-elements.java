class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            int val1=a[0];
            int val2=b[0];

            return val1==val2?Integer.compare(a[1],b[1]):Integer.compare(val2,val1);
        });

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int freq=entry.getValue();
            int key=entry.getKey();
            pq.add(new int []{freq,key});
        }
        int [] answer=new int[k];
        int idx=0;
        while(k-->0){
            int [] curr=pq.poll();
            answer[idx++]=curr[1];
        }

        return answer;

    }
}