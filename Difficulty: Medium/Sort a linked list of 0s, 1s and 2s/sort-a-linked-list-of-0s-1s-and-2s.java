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
        Node zeroHead=new Node(-1);
        Node temp1=zeroHead;
        Node oneHead=new Node(-1);
        Node temp2=oneHead;
        Node twoHead=new Node(-1);
        Node temp3=twoHead;
        
        Node curr=head;
        while(curr!=null){
            if(curr.data==0){
                temp1.next=new Node(curr.data);
                temp1=temp1.next;
                
            }
            else if(curr.data==1){
                temp2.next=new Node(curr.data);
                temp2=temp2.next;
            }
            else{
                 temp3.next=new Node(curr.data);
                temp3=temp3.next;
            }
            curr=curr.next;
        }
        
       
        if(oneHead.next!=null){
            temp1.next=oneHead.next;
        }
        else{
            temp1.next=twoHead.next;
        }
        
        temp2.next=twoHead.next;
        return zeroHead.next;
        
        
       
       
        
        
    }
}