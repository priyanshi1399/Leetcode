/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean leftToRight=false;
        while(!q.isEmpty()){
            int n=q.size(); //n=1 ,n=2
            List<Integer> temp=new ArrayList<>(Collections.nCopies(n,0)); //[]
            for(int i=0;i<n;i++){ //1>0 ,2>0 ,2>0
                TreeNode curr=q.poll(); //curr=3  curr=[9] curr=20 ,curr=15 ,curr=7
                int index=leftToRight==false?i:n-1-i;
                temp.set(index,curr.val); //temp-[3] ,temp-[9,20], temp-[15,7]

                if(curr.left!=null){
                    q.add(curr.left); //1=[9]  q=[15]
                }
                if(curr.right!=null){
                    q.add(curr.right); //q=[9,20] q.size()=2; ,q=[15,7]
                }
                
            }
            res.add(temp);
            leftToRight=!leftToRight; //false //true
            
            
        }
        return res;

    }
}