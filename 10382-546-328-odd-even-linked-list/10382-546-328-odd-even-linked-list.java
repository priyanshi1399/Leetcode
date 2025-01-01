/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode oddEvenList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=head.next;

        while(even!=null && even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;

            odd=odd.next; //update the pointer;
            even=even.next; //updating the position of pointer


        }
        odd.next=evenHead;
        return head;

    }
}

   /* public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        List<Integer> lst=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            lst.add(temp.val);
            temp=temp.next.next;
        }
        if(temp!=null){
            lst.add(temp.val);
        }
        temp=head.next;
        while(temp!=null && temp.next!=null){
            lst.add(temp.val);
            temp=temp.next.next;
        }
        if(temp!=null){
            lst.add(temp.val);          
        }
        temp=head;
        int i=0;
        while(temp!=null){
            temp.val=lst.get(i);
            temp=temp.next;
            i++;
        }
        return head;
    }
}
*/