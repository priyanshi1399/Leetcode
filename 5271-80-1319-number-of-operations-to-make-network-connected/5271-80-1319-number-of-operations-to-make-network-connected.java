class Solution {
    public void DFS(int u,boolean [] visited, List<List<Integer>> adj){
        visited[u]=true;

        for(int v: adj.get(u)){
            if(!visited[v]){
                DFS(v,visited,adj);
            }
        }
    }
    public int makeConnected(int n, int[][] connections) {
        if(connections.length<n-1){
            return -1; //dont have enough cables
        }

        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(i,new ArrayList<>());
        }
        for(int [] con:connections){
            adj.get(con[0]).add(con[1]);
            adj.get(con[1]).add(con[0]);
        }
        int count=0;
        boolean [] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                DFS(i,visited,adj);
                count++;
            }
        }
        return count-1;
    }
}