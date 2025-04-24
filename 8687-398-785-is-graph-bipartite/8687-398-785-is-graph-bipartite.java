class Solution {
    public boolean isBFSBipartite(int curr, int [] color, int [][] adj,int currColor){
        Queue<Integer> q=new LinkedList<>();

        q.add(curr);
        color[curr]=currColor;
        while(!q.isEmpty()){
            int u=q.peek();
            q.poll();

            for(int v:adj[u]){
                if(color[v]==color[u]){
                    return false;
                }
                if(color[v]==-1){
                    color[v]=1-color[u];
                    q.add(v);
                    }
                }
            }
        
            return true;
        
    }
    public boolean isBipartite(int[][] adj) {
        int n=adj.length;

        int [] color=new int[n];
        Arrays.fill(color,-1);
        for(int i=0;i<n;i++){
            if(color[i]==-1){
                if(isBFSBipartite(i,color,adj,1)==false){
                    return false;
                }
            }
        }
        return true;
    }
}