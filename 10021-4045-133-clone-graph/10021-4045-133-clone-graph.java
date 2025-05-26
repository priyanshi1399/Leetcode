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
        return dfs(node,new HashMap<Node,Node>());
    }

    public Node dfs(Node originalNode, HashMap<Node,Node> map){
        if(map.containsKey(originalNode)){
            return map.get(originalNode);
        }

        Node cloneNode=new Node(originalNode.val);
        map.put(originalNode,cloneNode);
        for(Node n:originalNode.neighbors){
            cloneNode.neighbors.add(dfs(n,map));
        }
        return cloneNode;
    }
}