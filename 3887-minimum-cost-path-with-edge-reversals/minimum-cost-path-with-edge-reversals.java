class Solution{

    static class Pair{
        int node;
        int dist;

        Pair(int node,int dist){
            this.node=node;
            this.dist=dist;
        }
    }

    public int minCost(int n, int[][] edges) {
        int len=edges.length;
        Map<Integer,List<Pair>> adj=new HashMap<>();

        for(int [] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int wt=edge[2];

            adj.computeIfAbsent(u,k->new ArrayList<>()).add(new Pair(v,wt));
            adj.computeIfAbsent(v,k->new ArrayList<>()).add(new Pair(u,2*wt)); //reversed edge
        }
        int []result=new int[n];
      
        Arrays.fill(result,Integer.MAX_VALUE);
        
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.dist-b.dist);
        pq.add(new Pair(0,0));
        result[0]=0;
        while(!pq.isEmpty()){
           
           Pair curr=pq.poll();
           int node=curr.node;
           int d=curr.dist;

           if(d>result[node]){
            continue;
           }

           if(node==n-1){
            return d;
           }

           if(!adj.containsKey(node)){
            continue;
           }

           for(Pair neighbor:adj.get(node)){
            int nextNode=neighbor.node;
            int weight=neighbor.dist;

            if(d+weight<result[nextNode]){
                    result[nextNode]=d+weight;
                    pq.add(new Pair(nextNode,result[nextNode]));
            }
           }

            
        }
        return -1;

    }
}