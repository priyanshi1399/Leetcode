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
        int size=0;
        ListNode curr=head;
        while(curr!=null){
            size++;
            curr=curr.next;
        }

        int res=size-n;
         curr=head;
        while(curr!=null){
            if(res==1){
                break;
            }
            curr=curr.next;
            res--;
            
        }
        if(size==n){
            ListNode newHead=head.next;
            return newHead; //returnning new Head beacuse whole will be deleted
        }
      
        ListNode nodeToDelete=curr.next;
        curr.next=curr.next.next;
        return head;


       

    }
}