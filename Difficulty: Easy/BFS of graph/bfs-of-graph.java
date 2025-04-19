//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java
class Solution {
    
    public void BFS(int u, HashMap<Integer,ArrayList<Integer>> adj,boolean [] visited, List<Integer> result, int V ){
        Queue<Integer> q=new LinkedList<>();
        q.add(u);
        visited[u]=true;
        result.add(u);
        while(!q.isEmpty()){
            u=q.poll();
            
            for(int v:adj.getOrDefault(u,new ArrayList<>())){
                if(!visited[v]){
                q.add(v);
                visited[v]=true;
                result.add(v);
            }
            }
            
        }
    }
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> mp) {
    HashMap<Integer,ArrayList<Integer>> adj=new HashMap<>();
    int V=mp.size();
    for(int u=0;u<V;u++){
        adj.put(u,adj.getOrDefault(u,new ArrayList<>()));
        for(int v: mp.get(u)){
            adj.get(u).add(v);
        }
    }
    
    boolean [] visited=new boolean[V];
    ArrayList<Integer> result=new ArrayList<>();
    
    for(int i=0;i<V;i++){
        if(!visited[i]){
            BFS(0,adj,visited,result,V);
        }
    }
    return result;
        
    }
}


//{ Driver Code Starts.

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
            ArrayList<Integer> ans = obj.bfs(adj);
            for (int num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends