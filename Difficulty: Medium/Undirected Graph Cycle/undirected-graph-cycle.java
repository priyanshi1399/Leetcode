//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();
            int[][] edges = new int[E][2];
            for (int i = 0; i < E; i++) {
                edges[i][0] = sc.nextInt();
                edges[i][1] = sc.nextInt();
            }

            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, edges);
            System.out.println(ans ? "true" : "false");
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    public boolean isCycleDFS(int u, List<List<Integer>> adj, boolean [] visited,int parent){
        visited[u]=true;
        
        for(int v:adj.get(u)){
            
            if(v==parent){
                continue;
            }
            
            if(visited[v]==true){
                return true;
            }
            
            if(isCycleDFS(v,adj,visited,u)){
                return true;
            }
        }
        return false;
    }
    public boolean isCycle(int V, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(i,new ArrayList<>());
        }
        
        for(int [] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        boolean [] vis=new boolean[V];
        for(int u=0;u<V;u++){
           if(!vis[u] && isCycleDFS(u,adj,vis,-1)){
               return true;
           }
        }
        return false;
    }
}