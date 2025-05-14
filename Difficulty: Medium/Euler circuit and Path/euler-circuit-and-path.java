//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tc = scanner.nextInt();
        
        while (tc-- > 0) {
            int V = scanner.nextInt();
            int E = scanner.nextInt();
            
            List<Integer>[] adj = new ArrayList[V];
            for (int i = 0; i < V; i++) {
                adj[i] = new ArrayList<>();
            }
            
            for (int i = 0; i < E; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                adj[u].add(v);
                adj[v].add(u);
            }
            
            // String x=scanner.nextLine();
            // scanner.nextLine();
            
            Solution obj = new Solution();
            int ans = obj.isEulerCircuit(V, adj);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {
    public void DFS(int u,boolean [] visited, List<Integer>[] adj){
        visited[u]=true;
        
        for(int v:adj[u]){
            if(!visited[v]){
                DFS(v,visited,adj);
            }
        }
    }
    public boolean isConnected(int V, List<Integer> [] adj){
        int nonZeroNode=-1;
        for(int i=0;i<V;i++){
            if(adj[i].size()>0){
                nonZeroNode=i;
                break;
            }
        }
        
        boolean [] visited=new boolean[V];
        
        DFS(nonZeroNode,visited,adj);
        
        
        for(int i=0;i<V;i++){
            if(visited[i]==false && adj[i].size()>0){
                return false;
            }
        }
        return true;
        
    }
    public int isEulerCircuit(int V, List<Integer>[] adj) {
        
        
        if(isConnected(V,adj)==false){
            return 0; //neither Euler Path nor Circuit
        }
        
        
        //check for OddNumberVertex
        int oddnumVertex=0;
        for(int i=0;i<V;i++){
            if(adj[i].size()%2!=0){
                oddnumVertex++;
            }
        }
        if(oddnumVertex>2){
            return 0; //nothing 
        }
        if(oddnumVertex==2){
            return 1;
        }
        return 2;
        
    }
}