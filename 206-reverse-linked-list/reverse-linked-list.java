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
    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead=reverseList(head.next); //2->3->4->5

        ListNode front=head.next; //solving for very small ;  returns 5

        front.next=head; // 4->5  front is 5 5.next->4 
        head.next=null; //4.next=null;

        return newHead; //return 5
    }
}