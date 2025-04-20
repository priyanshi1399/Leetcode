//{ Driver Code Starts
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
            boolean ans = obj.isCyclic(V, edges);
            System.out.println(ans ? "true" : "false");
        }
        sc.close();
    }
}
// } Driver Code Ends


class Solution {
    public boolean isCycleDFS(int u,ArrayList<ArrayList<Integer>> adj,boolean [] visited, boolean [] inRecursion, int V ){
        visited[u]=true;
        inRecursion[u]=true;
        
        for(int v:adj.get(u)){
            if(!visited[v] && isCycleDFS(v,adj,visited,inRecursion,V)){
                return true;
            }
            else if(inRecursion[v]==true){
                return true; //there is a cycle
            }
                
            }
            inRecursion[u]=false;
            return false;
        }
    public boolean isCyclic(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int [] edge:edges){
            adj.get(edge[0]).add(edge[1]);
        }
        
        boolean [] visited=new boolean[V];
        boolean [] inRecusrion=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i] && isCycleDFS(i,adj,visited,inRecusrion,V)){
                return true;
            }
        }
        return false;
        
    }
}