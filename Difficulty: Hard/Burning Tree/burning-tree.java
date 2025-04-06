//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class GfG {

    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    static void printInorder(Node root) {
        if (root == null) return;

        printInorder(root.left);
        System.out.print(root.data + " ");

        printInorder(root.right);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            String s = br.readLine();
            int target = Integer.parseInt(br.readLine());
            Node root = buildTree(s);

            Solution g = new Solution();
            System.out.println(g.minTime(root, target));
            t--;

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    private static HashMap<Node,Node> parentMap=new HashMap<>();
    /*class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }*/
    
    public static int minTime(Node root, int target) {
        inorder(root);
        Node targetNode=findTarget(root,target);
        HashSet<Integer> visited=new HashSet<>();
        Queue<Node> q=new LinkedList<>();
        q.add(targetNode);
        visited.add(targetNode.data);
        int count=0;
        while(!q.isEmpty()){
            int n=q.size();
            while(n-- >0){
                Node curr=q.poll();
                if(curr.left!=null && (!visited.contains(curr.left.data))){
                    q.add(curr.left);
                    visited.add(curr.left.data);
                }
                if(curr.right!=null && (!visited.contains(curr.right.data))){
                    q.add(curr.right);
                    visited.add(curr.right.data);
                }
                if(parentMap.containsKey(curr) && (!visited.contains(parentMap.get(curr).data))){
                    int value=parentMap.get(curr).data;
                    q.add(parentMap.get(curr));
                    visited.add(value);
                }
            }
            count++;
        }
        return count-1;
    }
    public static void inorder(Node root){
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
    public static Node findTarget(Node root, int target){
        if(root==null){
            return root;
        }
        if(root.data==target){
            return root;
        }
        Node left=findTarget(root.left,target);
        if(left!=null){
            return left;
        }
        return findTarget(root.right,target);
    }
}