class Solution {
    public void BFS(int u, int[][] isConnected,int n,boolean [] visited){
        Queue<Integer> q=new LinkedList<>();
        q.add(u);
        visited[u]=true;
        while(!q.isEmpty()){
            u=q.peek();
            q.poll();
            for(int v=0;v<n;v++){
                if(!visited[v] && isConnected[u][v]==1){
                    BFS(v,isConnected,n,visited);
                }
        }
       
    }
    }

    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int count=0;
        boolean [] visited=new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                BFS(i,isConnected,n,visited);
                count++;
            }
        }
            
        
        return count;
    }
}