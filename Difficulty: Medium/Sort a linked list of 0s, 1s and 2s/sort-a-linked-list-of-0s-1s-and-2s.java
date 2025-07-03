/* class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}*/
class Solution {
    static Node segregate(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node zeroHead=new Node(-1);
        Node oneHead=new Node(-1);
        Node twoHead=new Node(-1);
        
        Node zero=zeroHead;
        Node one=oneHead;
        Node two=twoHead;
        
        Node curr=head;
        while(curr!=null){
            if(curr.data==0){
                zero.next=curr;
                zero=zero.next; //or zero=curr
            }
            else if(curr.data==1){
                one.next=curr; //directly link the node
                one=one.next; //
            }
            else{
                two.next=curr; //directly link the node
                two=two.next; // two=curr bcz two's next is curr
            }
            curr=curr.next;
        }
        
        //zero will be at last
        zero.next=(oneHead.next!=null)?oneHead.next:twoHead.next;
        one.next=twoHead.next; //if twoHead is null then one.next=twoHead==null
        two.next=null;
        Node newHead=zeroHead.next;
        return newHead;
        
        
    }
}