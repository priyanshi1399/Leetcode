class Solution {
    public boolean bipartiteCheck(int currNode,List<List<Integer>> adj,int [] color, int currColor){
        color[currNode]=currColor;

        for(int v: adj.get(currNode)){
            if(color[v]==color[currNode]){
                return false;
            }

            if(color[v]==-1){
                int colorV=1-color[currNode];
                if(bipartiteCheck(v,adj,color,colorV)==false){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        int V=graph.length;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
 

       for(int i=0;i<V;i++){
        for(int j=0;j<graph[i].length;j++){
            adj.get(i).add(graph[i][j]);
            adj.get(graph[i][j]).add(i);
        }
       }

        int [] color=new int [V];
        Arrays.fill(color,-1);
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                if(bipartiteCheck(i,adj,color,1)==false){
                    return false;
                }
            }
        }
        return true;
    }
}