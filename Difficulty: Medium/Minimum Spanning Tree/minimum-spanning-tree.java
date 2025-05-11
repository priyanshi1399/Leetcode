//{ Driver Code Starts


import java.io.*;
import java.lang.*;
import java.util.*;

public class Main {
    static BufferedReader br;
    static PrintWriter ot;

    public static void main(String args[]) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        ot = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int V = Integer.parseInt(br.readLine().trim());
            int E = Integer.parseInt(br.readLine().trim());
            List<List<int[]>> list = new ArrayList<>();
            for (int i = 0; i < V; i++) list.add(new ArrayList<>());
            for (int i = 0; i < E; i++) {
                String[] s = br.readLine().trim().split(" ");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                int c = Integer.parseInt(s[2]);
                list.get(a).add(new int[] {b, c});
                list.get(b).add(new int[] {a, c});
            }
            ot.println(new Solution().spanningTree(V, E, list));

            ot.println("~");
        }
        ot.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int  find(int x,int [] parent){
        if(x==parent[x]){
            return x;
        }
        return parent[x]=find(parent[x],parent);
    }
    
    public static void union(int x,int y, int [] parent, int [] rank){
        int x_Parent=find(x,parent);
        int y_Parent=find(y,parent);
        
        if(x_Parent==y_Parent){
            return;
        }
        
        else if (rank[x_Parent]> rank[y_Parent]){
            parent[y_Parent]=x_Parent;
        }
           
        else if (rank[y_Parent]> rank[x_Parent]){
            parent[x_Parent]=y_Parent;
        }
        else{
            parent[y_Parent]=x_Parent;
            rank[x_Parent]++;
        }
        
    }
    public static int krushkal(List<int[]> edges,int [] parent, int [] rank){
        int sum=0;
        
        for(int [] edge:edges){
            int u=edge[0];
            int v=edge[1];
            int wt=edge[2];
            
            int parentU=find(u,parent);
            int parentV=find(v,parent);
            if(parentU!=parentV){
                union(u,v,parent,rank);
                sum+=wt;
            }
        }
        return sum;
    }
    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        int [] parent=new int[V];
        int [] rank=new int[V];
        
        for(int i=0;i<V;i++){
            parent[i]=i;
        }
        List<int[]> edges=new ArrayList<>();
        
        for(int i=0;i<V;i++){
            for(int [] temp: adj.get(i)){
                int u=i;
                int v=temp[0];
                int wt=temp[1];
                edges.add(new int []{u,v,wt});
            }
        }
        
        edges.sort((a,b)->Integer.compare(a[2],b[2])); //sort according to wt
        
        return krushkal(edges,parent,rank);
    }
}