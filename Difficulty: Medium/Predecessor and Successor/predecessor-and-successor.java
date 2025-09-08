/* BST Node
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
} */

class Solution {
    Node predecessor=null;
    Node successor=null;
    public void findPredecessor(Node root,int key){
        while(root!=null){
            if(root.data>=key){
                root=root.left;
            }
            else{
                predecessor=root;
                root=root.right; //can be found slightly greater
            }
        }
    }
        
        public void findSuccessor(Node root,int key){
        while(root!=null){
            if(root.data<=key){
                root=root.right;
            }
            else{
                successor=root;
                root=root.left; //can be found slightly smaller
            }
        }
    }
    public ArrayList<Node> findPreSuc(Node root, int key) {
     
     findPredecessor(root,key);
     findSuccessor(root,key);
    
    ArrayList<Node> arr=new ArrayList<>();
    arr.add(predecessor);
    arr.add(successor);
    return arr;
    }
}