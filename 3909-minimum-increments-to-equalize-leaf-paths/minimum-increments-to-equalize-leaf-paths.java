class Solution {
    int count=0;
    public long dfs(int node,int parent, List<List<Integer>> adjList,int [] cost){
        if(adjList.get(node).size()==1 && parent!=-1){ //leaf node return the value
            return cost[node];
        }

        //if npot the leaf node
        long maxSum=0;
        List<Long> ChildNodes=new ArrayList<>();

        for(int  neighbor:adjList.get(node)){
            if(neighbor==parent){
                continue; //to avoid repetition or cycle
            }

            long ChildCost=dfs(neighbor,node,adjList,cost);
            ChildNodes.add(ChildCost);
            maxSum=Math.max(maxSum,ChildCost); //we need maxSum to return to the upper node
        }

        for(long ChildCost:ChildNodes){
            if(ChildCost<maxSum){
                count++; //fixing it on the child level itself
            }
        }

        return (cost[node]+maxSum); //return to the upper node 

    }   
    public int minIncrease(int n, int[][] edges, int[] cost) {
        List<List<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }

        for(int [] edge:edges){
            int u=edge[0];
            int v=edge[1];

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        dfs(0,-1,adjList,cost);//appying dfs from root
        return count;
        
    }
}