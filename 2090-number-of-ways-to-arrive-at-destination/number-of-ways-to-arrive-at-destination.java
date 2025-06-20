class Solution {
    private final int mod=10_00_00_00_07;
    public int countPaths(int n, int[][] roads) {
        List<List<int[]>> adjList=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }

        for(int [] r: roads){
            int u=r[0];
            int v=r[1];
            int w=r[2];

            adjList.get(u).add(new int []{v,w});
            adjList.get(v).add(new int []{u,w});
        }

        long [] res=new long[n];
        Arrays.fill(res,Long.MAX_VALUE);
        res[0]=0;
        long [] countPath=new long[n];
        countPath[0]=1; //1 path will always be there

        PriorityQueue<long []> pq=new PriorityQueue<>((a,b)->Long.compare(a[1],b[1]));

        pq.add(new long[]{0,0});
        while(!pq.isEmpty()){
            long [] curr=pq.poll();
            int currNode=(int)curr[0];
            long d=curr[1];

            for(int [] neighbor: adjList.get(currNode)){
                int adjNode=neighbor[0];
                int dist=neighbor[1];

                if(d+dist<res[adjNode]){
                    res[adjNode]=d+dist;
                    countPath[adjNode]=countPath[currNode];
                    pq.add(new long []{adjNode,d+dist});
                }                                             
                else if(d+dist==res[adjNode]){
                    countPath[adjNode]=(countPath[adjNode]+countPath[currNode])%mod;
                }
            }

        }
        return (int)countPath[n-1];
    }
}