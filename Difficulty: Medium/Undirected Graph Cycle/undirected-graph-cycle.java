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
    public boolean isCycleDFS(int u,boolean[] visited, HashMap<Integer,ArrayList<Integer>> adj,int parent,int V){
        visited[u]=true;
        
        for(int v:adj.getOrDefault(u,new ArrayList<>())){
            if(parent==v){
                continue;
            }
            
            if(visited[v]==true){
                return true;
            }
            
               if(isCycleDFS(v,visited,adj,u,V)){
                    return true;
                }
                }
            return false;
        }
    public boolean isCycle(int V, int[][] edges) {
        HashMap<Integer,ArrayList<Integer>> adj=new HashMap<>();
    
        for(int [] edge:edges){
            int u=edge[0];
            int v=edge[1];
            
            adj.computeIfAbsent(u,k->new ArrayList<>()).add(v);
            adj.computeIfAbsent(v,k->new ArrayList<>()).add(u);
            
        }
        boolean [] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i] && isCycleDFS(i,visited,adj,-1,V)){
                return true;
            }
        }
        return false;
        
    }
}