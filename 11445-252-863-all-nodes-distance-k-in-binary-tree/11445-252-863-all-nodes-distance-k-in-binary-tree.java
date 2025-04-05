/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
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
    public void BFS(TreeNode root, TreeNode target, int k,List<Integer> result){

        Queue<TreeNode> q=new LinkedList<>();
        Set<Integer> visited=new HashSet<>();
        q.add(target);
        visited.add(target.val);
        while(!q.isEmpty()){
            int n=q.size();
            if(k==0){
                break;
            }
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
                    TreeNode value=parentMap.get(curr);
                q.add(value);
                visited.add(value.val);
                }
            }
            k--;
        }
        while(!q.isEmpty()){
            result.add(q.poll().val);
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        inorder(root);
        
        List<Integer> result =new ArrayList<>();
        BFS(root,target,k,result);
        return result;

        }
    }
