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
        ListNode evenHead=head.next; //stored to connect later

        while(even!=null && even.next!=null){
            odd.next=odd.next.next; //1->3->5
            even.next=even.next.next; //2->4
             //2 is sepearted so before only we have stored it
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;

    }
}