/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Pair<K,V>{
    private final K key;
    private final V value;
    
    public Pair(K key,V value){
        this.key=key;
        this.value=value;
        
    }
    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
    
}
class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Pair<Node,Integer>> q=new LinkedList<>();
        if(root==null){
            return new ArrayList<>();
        }
        q.add(new Pair<>(root,0)); //insert root and level 0
        while(!q.isEmpty()){
            int n=q.size();
            while(n-->0){
                Pair<Node,Integer> pair=q.poll();
                int level=pair.getValue();
                Node currNode=pair.getKey();
                if(!map.containsKey(level)){
                    map.put(level,currNode.data);
                }
                if(currNode.left!=null){
                    q.add(new Pair<>(currNode.left,level-1));
                }
                if(currNode.right!=null){
                    q.add(new Pair<>(currNode.right,level+1));
                }
            }
        }
        return new ArrayList<>(map.values());
        
       
        
    }
}