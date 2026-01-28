class Solution {
    public int minCost(int n, int[][] edges) {
        
        List<List<int[]>> adjList=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int [] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int wt=edge[2];

            adjList.get(u).add(new int []{wt,v});
            adjList.get(v).add(new int []{2*wt,u});

        }

        int [] result=new int[n];
        Arrays.fill(result,Integer.MAX_VALUE);

        result[0]=0;

        PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        pq.add(new int []{0,0});
        while(!pq.isEmpty()){

            int [] curr=pq.poll();
            int d=curr[0];
            int node=curr[1];

            if(node==n-1){
                return d;
            }
            if(d>result[node]){
                continue;
            }

            for(int [] neighbor:adjList.get(node)){

                int dist=neighbor[0];
                int nextNode=neighbor[1];

                if(d+dist<result[nextNode]){
                    result[nextNode]=d+dist;
                    pq.add(new int []{result[nextNode],nextNode});
                }
                
            }

        }
        return -1;



    }
}