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
            boolean ans = obj.isBipartite(V, edges);
            System.out.println(ans ? "true" : "false");
            System.out.println("~");
        }
        sc.close();
    }
}
// } Driver Code Ends


class Solution {
    public boolean isBFSBipartite(int curr,HashMap<Integer, List<Integer>> adj,int [] color,int currColor){
       
        Queue<Integer> q=new LinkedList<>();
        q.add(curr);
        color[curr]=currColor;
        while(!q.isEmpty()){
            int u=q.peek();
            q.poll();
            for(int v:adj.getOrDefault(u,new ArrayList<>())){
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
    public boolean isBipartite(int V, int[][] edges) {
        HashMap<Integer, List<Integer>> adj=new HashMap<>();
        for(int i=0;i<V;i++){
            adj.putIfAbsent(i,new ArrayList<>());
        }
        
        for(int [] edge:edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
            
        }
        int [] color=new int[V];
        Arrays.fill(color,-1);
        for(int i=0;i<V;i++){
            if(color[i]==-1){
                if(isBFSBipartite(i,adj,color,1)==false){
                    return false;
                }
            }
        }
        return true;
        
    }
}