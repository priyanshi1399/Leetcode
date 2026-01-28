class Solution{


    public int minCost(int n, int[][] edges) {
        int len=edges.length;
        List<List<int[]>> adjList=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int [] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int w=edge[2];

            adjList.get(u).add(new int[]{v,w});
            adjList.get(v).add(new int[]{u,2*w}); //reverse
        }
        int []result=new int[n];
      
        Arrays.fill(result,Integer.MAX_VALUE);
        
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[0],b[0]));
        pq.add(new int[]{0,0});
        result[0]=0;
        while(!pq.isEmpty()){
           
          int [] curr=pq.poll();
          int d=curr[0];
          int node=curr[1];

           if(d>result[node]){
            continue;
           }

           if(node==n-1){
            return d;
           }

           for(int [] neighbor:adjList.get(node)){
            int nextNode=neighbor[0];
            int weight=neighbor[1];

            if(d+weight<result[nextNode]){
                    result[nextNode]=d+weight;
                    pq.add(new int[]{result[nextNode],nextNode});
            }
           }

            
        }
        return -1;

    }
}