class Solution {
   
       public boolean isSafe(int col, int node,int [] colors, ArrayList<ArrayList<Integer>> adjList){
        for(int neighbour: adjList.get(node)){
            if(colors[neighbour]==col){
                return false; // alreday painted with the same color
            }
        }
        return true;
    }
    public boolean solve(int node,int m,int v, ArrayList<ArrayList<Integer>> adjList,int [] colors){
        if(node==v){
            return true;
        }
        
        for(int i=1;i<=m;i++){
            if(isSafe(i,node,colors,adjList)){
                colors[node]=i;
                if(solve(node+1,m,v,adjList,colors)==true){
                    return true; //returns true if possible from one.
                }
                colors[node]=0;
            }
            
        }
        return false; //we never reached
    }
    boolean graphColoring(int v, int[][] edges, int m) {
           ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
           for(int i=0;i<v;i++){
               adjList.add(new ArrayList<>());
           }
           
           for(int [] edge: edges){
               adjList.get(edge[0]).add(edge[1]);
               adjList.get(edge[1]).add(edge[0]); //creation of adjacency list
           }
           
          int [] colors=new int[v];
          return solve(0,m,v,adjList,colors);
          
           
        
    }
}