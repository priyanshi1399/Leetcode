/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    public boolean isLeaf(Node root){
        if(root.left==null && root.right==null){
            return true;
        }
        return false;
    }
    public void addLeafNodes(Node root, List<Integer> res){
        
        if(isLeaf(root)){
            res.add(root.data);
            
        }
        
        if(root.left!=null){
            addLeafNodes(root.left,res);
        }
        if(root.right!=null){
            addLeafNodes(root.right,res);
        }
        
    }
     public void addLeftBoundary(Node root, List<Integer> res){
         Node curr=root.left;
         while(curr!=null){
           if(!isLeaf(curr)){
               res.add(curr.data);
           }
           if(curr.left!=null){
               curr=curr.left;
           }
           else{
               curr=curr.right;
           }
       }
    }
    
     public void addRightBoundary(Node root, List<Integer> res){
         List<Integer> temp=new ArrayList<>(); //we want answer in reverse order
       Node curr=root.right ;//root and left already included include right
       while(curr!=null){
           if(!isLeaf(curr)){
               temp.add(curr.data);
           }
           if(curr.right!=null){
               curr=curr.right;
           }
           else{
               curr=curr.left;
           }
       }
      for(int i=temp.size()-1;i>=0;i--){
          res.add(temp.get(i));
      }
    }
    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        
        
        if(!isLeaf(root)){
            res.add(root.data); //add root first
        }
        addLeftBoundary(root,res);
        addLeafNodes(root,res);
        addRightBoundary(root,res);
        return res;
        
        
    }
}