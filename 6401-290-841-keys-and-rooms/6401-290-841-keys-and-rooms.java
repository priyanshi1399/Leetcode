class Solution {
    public void dfs(int u, boolean [] visited,List<List<Integer>> rooms){
        visited[u]=true;

        for(int v: rooms.get(u)){
            if(!visited[v]){
                dfs(v,visited,rooms);
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean [] visited=new boolean[n];
        dfs(0,visited,rooms);
        
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                return false;
            }
        }
        return true;
        
    }
}