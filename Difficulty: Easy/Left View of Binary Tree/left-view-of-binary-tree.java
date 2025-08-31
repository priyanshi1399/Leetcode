/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Solution {
    ArrayList<Integer> leftView(Node root) {
       ArrayList<Integer> res=new ArrayList<>();
       Queue<Node> q=new LinkedList<>();
       if(root==null){
           return res;
       }
       q.add(root);
       while(!q.isEmpty()){
           int n=q.size();
           List<Integer> temp=new ArrayList<>();
           while(n-->0){
              Node curr=q.poll();
              temp.add(curr.data);
              if(curr.left!=null){
                  q.add(curr.left);
              }
              if(curr.right!=null){
                  q.add(curr.right);
              }
           }
           res.add(temp.get(0));
       }
       return res;
        
    }
}