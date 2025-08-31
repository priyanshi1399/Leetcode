/*
class Node
{
    int data; //data of the node
    int hd; //horizontal distance of the node
    Node left, right; //left and right references

    // Constructor of tree node
    public Node(int key)
    {
        data = key;
        hd = Integer.MAX_VALUE;
        left = right = null;
    }
}
*/

class Solution {
    public class Pair<K,V>{
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
    public ArrayList<Integer> bottomView(Node root) {
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Pair<Integer,Node>> q=new LinkedList<>();
        q.add(new Pair<>(0,root));
        while(!q.isEmpty()){
            int n=q.size();
            while(n-->0){
                Pair<Integer,Node> pair=q.poll();
                int level=pair.getKey();
                Node curr=pair.getValue();
                map.put(level,curr.data);
                if(curr.left!=null){
                    q.add(new Pair<>(level-1,curr.left));
                }
                if(curr.right!=null){
                    q.add(new Pair<>(level+1,curr.right));
                }
            }
        }
        return new ArrayList<>(map.values());
        
        
        
    }
}