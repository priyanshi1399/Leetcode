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
    Map<TreeNode,TreeNode> parentMap=new HashMap<>();
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            parentMap.put(root.left,root);
        }
        inorder(root.left);
        if(root.right!=null){
            parentMap.put(root.right,root);
        }
        inorder(root.right);

    }
    public TreeNode findTarget(TreeNode root, int start){
        if(root==null){
            return root;
        }
        if(root.val==start){
            return root;
        }
        TreeNode left=findTarget(root.left,start);
        if(left!=null){
            return left;
        }
        return findTarget(root.right,start);
    }
    public int amountOfTime(TreeNode root, int start) {
        inorder(root);
        TreeNode target=findTarget(root,start);
        Queue<TreeNode> q=new LinkedList<>();
        Set<Integer> visited=new HashSet<>();
        q.add(target);
        visited.add(target.val);
        int count=0;
        while(!q.isEmpty()){
            int n=q.size();
            while(n-- >0){
            TreeNode curr=q.poll();
            if(curr.left!=null && (!visited.contains(curr.left.val))){
                q.add(curr.left);
                visited.add(curr.left.val);
            }
            if(curr.right!=null && (!visited.contains(curr.right.val))){
                q.add(curr.right);
                visited.add(curr.right.val);
            }
            if(parentMap.containsKey(curr) && (!visited.contains(parentMap.get(curr).val))){
                int value=parentMap.get(curr).val;
                q.add(parentMap.get(curr));
                visited.add(value);
            }
        
            }
            count++;    
        }
        return count-1;
        }
}