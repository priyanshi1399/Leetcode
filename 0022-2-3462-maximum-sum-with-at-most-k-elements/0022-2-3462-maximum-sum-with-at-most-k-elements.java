class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        
        PriorityQueue<Pair<Integer,Integer>> pq=new PriorityQueue<>((a,b)->Integer.compare(b.getKey(),a.getKey()));
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){

                pq.add(new Pair(grid[i][j],i));
            }
        }

        long sum=0;
        while(k>0){
            Pair <Integer,Integer> p=pq.poll();
            if(limits[p.getValue()]>0){
                    sum=sum+p.getKey();
                    limits[p.getValue()]--;
                    k--;
            }
            
        }

       return sum; 


    }
    class Pair <K,V>{
        private final  K key;
        private final  V value;

        public Pair(K key, V value){
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
}