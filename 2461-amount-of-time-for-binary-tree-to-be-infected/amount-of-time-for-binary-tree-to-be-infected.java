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
    public void inorder(TreeNode root,HashMap<TreeNode,TreeNode> map){
        if(root==null){
            return;
        }
        if(root.left!=null){
            map.put(root.left,root);
        }
        inorder(root.left,map);
        if(root.right!=null){
            map.put(root.right,root);
        }
        inorder(root.right,map);

    }
    public TreeNode makeNode(TreeNode root,int start){
        if(root==null){
            return null;
        }
        if(root.val==start){
            return root;
        }

        TreeNode left=makeNode(root.left,start);
        if(left!=null){
            return left;
        }
        return makeNode(root.right,start);
    }
    public int amountOfTime(TreeNode root, int start) {
        HashMap<TreeNode,TreeNode> parentMap=new HashMap<>();
        inorder(root,parentMap);
        TreeNode startNode=makeNode(root,start);
        Queue<TreeNode> q=new LinkedList<>();
        HashSet<Integer> set=new HashSet<>();
        q.add(startNode); //add to the queue
        set.add(start); //add same value to the set
        int minute=0;
        while(!q.isEmpty()){
            int n=q.size();
            while(n-->0){
                TreeNode curr=q.poll();
                if((curr.left!=null) && (!set.contains(curr.left.val))){ //check ro left child
                    q.add(curr.left);
                    set.add(curr.left.val);
                }
                if((curr.right!=null) && (!set.contains(curr.right.val))){ //check for right child
                    q.add(curr.right);
                    set.add(curr.right.val);
                }
                if((parentMap.containsKey(curr)) && (!set.contains(parentMap.get(curr).val))){ //check for parent
                    TreeNode temp=parentMap.get(curr);
                    q.add(temp);
                    set.add(temp.val);
                }
            }
            minute++;
        }
        return minute-1;

    }
}