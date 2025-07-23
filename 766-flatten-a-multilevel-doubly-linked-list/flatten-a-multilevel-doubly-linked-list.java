/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node curr=head;
        while(curr!=null){
            if(curr.child!=null){
            Node nextNode=curr.next ; //store it bcz it will be changed
            curr.next=flatten(curr.child);
            curr.next.prev=curr;
            curr.child=null; //must do
            while(curr.next!=null){
                curr=curr.next;
            }
            if(nextNode!=null){
                curr.next=nextNode;
                nextNode.prev=curr;
            }
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }
}