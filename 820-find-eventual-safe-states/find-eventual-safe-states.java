class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V=graph.length;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int [] outdegree=new int[V];
        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(graph[i][j]).add(i); //reverse graph
                outdegree[i]++; // make outdegree instead of indegree 
            }
        }
        Queue<Integer> q=new LinkedList<>();
        boolean [] safeStates=new boolean[V];
        for(int i=0;i<V;i++){
            if(outdegree[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int u=q.poll();
            safeStates[u]=true;
            for(int v:adj.get(u)){
                outdegree[v]--;
                if(outdegree[v]==0){
                    q.add(v);
                    safeStates[v]=true;
                }
            }
        }

        List<Integer> res=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(safeStates[i]==true){
                res.add(i);
            }
        }
        return res;
    }
}