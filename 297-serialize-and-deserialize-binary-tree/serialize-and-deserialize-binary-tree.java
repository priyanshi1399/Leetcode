/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder res=new StringBuilder();
        if(root==null){
            return res.toString();
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null){
                res.append("n "); //add any delimeter and space
                continue;
            }
            res.append(curr.val).append(" ");
            q.add(curr.left);
            q.add(curr.right);
        }
        System.out.print(res.toString());
        return res.toString();



    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("")){ //empty string
            return null;
        }
        String [] values=data.split(" ");
        Queue<TreeNode> q=new LinkedList<>();
        TreeNode root=new TreeNode(Integer.parseInt(values[0]));
        q.add(root);
          
            for(int i=1;i<values.length;i++){
                  TreeNode parent=q.poll();
                if(!values[i].equals("n")){
                    TreeNode left=new TreeNode(Integer.parseInt(values[i]));
                    parent.left=left;
                    q.add(left);
                }
                if(!values[++i].equals("n")){
                    TreeNode right=new TreeNode(Integer.parseInt(values[i]));
                    parent.right=right;
                    q.add(right);
                }
            }
        return root;

        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));