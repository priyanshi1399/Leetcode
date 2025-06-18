class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {

        List<List<int []>> adjList=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int [] f: flights){
            int u=f[0];
            int v=f[1];
            int w=f[2];

            adjList.get(u).add(new int []{v,w});
        }
        int [] res=new int[n];
        Arrays.fill(res,Integer.MAX_VALUE);
        res[src]=0;
        Queue<int[]> q=new LinkedList<>();

        q.add(new int [] {src,0});
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(level>k){
                break;
            }
            while(size-->0){
                int [] curr=q.poll();
                int srcNode=curr[0];
                int c=curr[1];
                
                for(int [] neighbor: adjList.get(srcNode)){
                    int adjNode=neighbor[0];
                    int cost=neighbor[1];

                    if(c+cost<res[adjNode]){
                        res[adjNode]=c+cost;
                        q.add(new int []{adjNode,c+cost});
                    }
                }
            }
                level++;
            
        }
        if(res[dst]!=Integer.MAX_VALUE){
            return res[dst];
        }
        return -1;
    }
}