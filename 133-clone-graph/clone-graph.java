/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node==null){
            return null;
        }
        HashMap<Node,Node> graph=new HashMap<>();
        return dfs(graph,node);

    }
    public Node dfs(HashMap<Node,Node> graph, Node originalNode){
        if(graph.containsKey(originalNode)){
            return graph.get(originalNode);
        }

        Node cloneNode=new Node(originalNode.val);
        graph.put(originalNode,cloneNode);
        for(Node n:originalNode.neighbors){
            cloneNode.neighbors.add(dfs(graph,n));
        }
        return cloneNode;
    }
}