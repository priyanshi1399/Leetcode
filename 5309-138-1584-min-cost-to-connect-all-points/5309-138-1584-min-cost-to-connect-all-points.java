class Solution {

    public int minCost(List<List<int[]>> adj, int V){
         int sum=0;
            boolean [] inMST=new boolean[V];

            PriorityQueue<int[]> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
            pq.add(new int []{0,0});

            while(!pq.isEmpty()){

                int [] curr=pq.poll();
                int wt=curr[0];
                int node=curr[1];

                if(inMST[node]==true){
                    continue;
                }

                inMST[node]=true;
                sum+=wt;

                for(int [] neighbour:adj.get(node)){
                    int neighbour_node=neighbour[0];
                    int neighbour_wt=neighbour[1];

                    if(!inMST[neighbour_node]){
                        pq.add(new int []{neighbour_wt,neighbour_node});
                    }
                }

            }
        return sum;
    }
    public int minCostConnectPoints(int[][] points) {
        int V=points.length;
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<V;i++){
            for(int j=i+1;j<V;j++){
                int x1=points[i][0];
                int y1=points[i][1];
                int x2=points[j][0];
                int y2=points[j][1];

                int dist=Math.abs(x2-x1)+Math.abs(y2-y1);
                adj.get(i).add(new int []{j,dist});
                adj.get(j).add(new int []{i,dist});

            }
        }
        return minCost(adj,V);
           
    }
}