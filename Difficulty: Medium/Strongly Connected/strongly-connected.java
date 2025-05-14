//{ Driver Code Starts
// Initial Template for Java
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    public void DFS(ArrayList<ArrayList<Integer>> reverseAdj,boolean [] visited,int u){
        visited[u]=true;
        
        for(int v:reverseAdj.get(u)){
            if(!visited[v]){
                DFS(reverseAdj,visited,v);
            }
        }
    }
    public void DFSFill(int u,ArrayList<ArrayList<Integer>> adj, boolean [] visited, Stack<Integer> stck ){
        visited[u]=true;
        
        for(int v: adj.get(u)){
            if(!visited[v]){
                 DFSFill(v,adj,visited,stck);
            }
        }
        stck.push(u);
    }
    // Function to find number of strongly connected components in the graph.
    public int kosaraju(ArrayList<ArrayList<Integer>> adj) {
        int V=adj.size();
        Stack<Integer> stck=new Stack<>();
        
        boolean[] visited=new boolean[V];
        
        for(int u=0;u<V;u++){
            if(!visited[u]){
                DFSFill(u,adj,visited,stck);
            }
        }
        
        //make reverse graph
        ArrayList<ArrayList<Integer>> reverseAdj=new ArrayList<>();
       for(int i=0;i<V;i++){
           reverseAdj.add(new ArrayList<>());
       }
       for( int u=0;u<V;u++){
           for(int v: adj.get(u)){
               reverseAdj.get(v).add(u);
           }
       }
        Arrays.fill(visited,false);
        
        int count=0;
        while(!stck.isEmpty()){
                int u=stck.peek();
                stck.pop();
                    if(!visited[u]){
                        DFS(reverseAdj,visited,u);
                            count++;
                    }
        }    
        return count;
        
    }
}


//{ Driver Code Starts.

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();

            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }

            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj.get(u).add(v);
            }

            Solution obj = new Solution();
            System.out.println(obj.kosaraju(adj));

            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends