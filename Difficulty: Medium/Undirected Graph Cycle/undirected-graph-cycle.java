class Solution {
    public boolean isDFSCycle( List<List<Integer>> adjList, boolean [] visited,int u,int parent){
        visited[u]=true;
        
        for(int v: adjList.get(u)){
                
                if(parent==v){
                    continue;
                }
                if(visited[v]==true){
                    return true;
                }
                if(isDFSCycle(adjList,visited,v,u)){
                    return true;
                }
            
        }
        return false;
    }
    public boolean isCycle(int V, int[][] edges) {
        List<List<Integer>> adjList=new ArrayList<>();
       for(int i=0;i<V;i++){
           adjList.add(new ArrayList<>());
       }
       
       for(int [] e:edges){
           int u=e[0];
           int v=e[1];
           
           adjList.get(u).add(v);
           adjList.get(v).add(u);
       }
       
       
     
       boolean [] visited=new boolean [V];
       
       for(int u=0;u<V;u++){
           if(!visited[u] && isDFSCycle(adjList,visited,u,-1) ){
                   return true;
               }
           }
       
       return false;
        
    }
}