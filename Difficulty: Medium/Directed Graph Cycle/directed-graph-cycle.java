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
    public boolean isCyclic(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int [] edge:edges){
            adj.get(edge[0]).add(edge[1]);
        }
        
        int [] indegree=new int[V];
        for(int u=0;u<V;u++){
            for(int v:adj.get(u)){
                indegree[v]++;
            }
        }
        int count=0;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.add(i);
                count++;
            }
        }
        
        while(!q.isEmpty()){
            
            int u=q.peek();
            q.poll();
            
            for(int v: adj.get(u)){
                indegree[v]--;
                if(indegree[v]==0){
                    q.add(v);
                    count++;
                }
            }
        }
        
        if(count==V){
            return false;
        }
        return true;
        
        
    }
}