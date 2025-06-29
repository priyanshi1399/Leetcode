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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }
        
        curr=head;
        int res=size-n;
        while(curr!=null){
            res--;
            if(res==0){
                break;
            }          
            curr=curr.next;

        }
        if(size==n){
            ListNode newHead=head.next;
            return newHead;
        }
        ListNode nodeTodelete=curr.next;
        curr.next=curr.next.next;

       return head;
    }

}