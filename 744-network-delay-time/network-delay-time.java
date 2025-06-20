class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int []>> adjList=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adjList.add(new ArrayList<>());
        }

        for(int [] t:times){
            int u=t[0];
            int v=t[1];
            int w=t[2];

            adjList.get(u).add(new int []{v,w});
        }

        int [] res=new int[n+1];
        Arrays.fill(res,Integer.MAX_VALUE);
        res[k]=0;
        
        PriorityQueue<int []> pq=new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
        pq.add(new int []{k,0});

        while(!pq.isEmpty()){
            int [] curr=pq.poll();
            int srcNode=curr[0];
            int t=curr[1];

            for(int [] neighbor:adjList.get(srcNode)){
                int adjNode=neighbor[0];
                int time=neighbor[1];

                if(t+time<res[adjNode]){
                    res[adjNode]=t+time;
                    pq.add(new int []{adjNode,t+time});
                }
            }
        }
        int minVal=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            minVal=Math.max(minVal,res[i]);
            if(res[i]==Integer.MAX_VALUE){
                return -1;
            }
        }
        return minVal;


    }
}