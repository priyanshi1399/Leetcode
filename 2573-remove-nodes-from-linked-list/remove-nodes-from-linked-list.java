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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode n=head;
        ListNode curr=head;

        while(curr!=null){
            n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
        }
        return prev;

    }
    public ListNode removeNodes(ListNode head) {
        ListNode newHead=reverse(head);

        ListNode temp=newHead;
        while(temp!=null && temp.next!=null){
          if(temp.val>temp.next.val){
            temp.next=temp.next.next;
          }
          else{
            temp=temp.next;
          }
        }
        

        ListNode res= reverse(newHead);
        return res;

    }
}