//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            int V = Integer.parseInt(br.readLine().trim());
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                String[] input = br.readLine().trim().split(" ");
                ArrayList<Integer> node = new ArrayList<>();
                for (String s : input) {
                    if (!s.isEmpty()) {
                        node.add(Integer.parseInt(s));
                    }
                }
                adj.add(node);
            }

            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.dfs(adj);
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    
    public void DFS(int u,List<Integer> result,  HashMap<Integer,ArrayList<Integer>> adj, boolean [] visited, int V){
        if(visited[u]==true){
            return;
        }
        
        visited[u]=true;
        result.add(u);
        for(int  v: adj.getOrDefault(u,new ArrayList<>())){
            if(!visited[v]){
                DFS(v,result,adj,visited,V);
            }
        }
    }
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> mp) {
        int V=mp.size();
        HashMap<Integer,ArrayList<Integer>> adj=new HashMap<>();
        
        for(int u=0;u<V;u++){
            adj.putIfAbsent(u, new ArrayList<>());
            for(int v: mp.get(u)){
                adj.get(u).add(v);
            }
        }
        
        ArrayList<Integer> result=new ArrayList<>();
        boolean [] visited=new boolean[V];
        
        DFS(0,result,adj,visited,V);
        return result;
        
        
    }
}