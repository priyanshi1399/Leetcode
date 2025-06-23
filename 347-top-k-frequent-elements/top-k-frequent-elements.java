class Solution {
    class Pair <K,V>{

        private final K key;
        private final V value;

        public Pair( K key,  V value){
            this.key=key;
            this.value=value;
        }


        public K getKey(){
            return key;
        }
        public V getValue(){
            return value;
        }

    }
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<>((a,b)->Integer.compare(a.getValue(),b.getValue()));

        

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
             pq.add(new Pair<>(entry.getKey(),entry.getValue()));
            while(pq.size()>k){
                pq.poll();
            }
           
        }

         for (Pair<Integer, Integer> pair : pq) {
            System.out.println(pair.getKey()+ ":" +pair.getValue());
            }
        int idx=0;
        int [] ans=new int[k];
        while(!pq.isEmpty()){
            ans[idx]=pq.poll().getKey();
            idx++;
        }
            
        return ans;


        
    }
}