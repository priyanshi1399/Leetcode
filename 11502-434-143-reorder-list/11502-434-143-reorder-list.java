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
  /*  public void reorderList(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        ListNode secondHalf=slow.next;
        slow.next=null;
        ListNode firstHalf=head;
        secondHalf=reverse(secondHalf);

        while(firstHalf!=null && secondHalf!=null){
        ListNode temp1=firstHalf.next;
        ListNode temp2=secondHalf.next;

        firstHalf.next=secondHalf;
        secondHalf.next=temp1;
        firstHalf=temp1;
        secondHalf=temp2;

    }
    }

    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode n=head;

        while(curr!=null){
            n=curr.next;
            curr.next=prev;
            prev=curr;
            curr=n;
        }
        return prev;
    }
}
*/
 public void reorderList(ListNode head) {
    
    ListNode fast=head;
    ListNode slow=head;
    while(fast!=null && fast.next!=null){
        fast=fast.next.next;
        slow=slow.next;
    }

    ListNode prev=null;
    ListNode curr=slow;

    while(curr!=null){
        ListNode temp=curr.next;
        curr.next=prev;
        prev=curr;
        curr=temp;
    }
    ListNode first=head; //1-->2-->3-->4-->5
    ListNode second=prev; //8-->7-->6-->5

    while(second!=null && second.next!=null) //because it will get null fast
    {
        ListNode temp1=first.next;
        ListNode temp2=second.next;

        first.next=second;
        second.next=temp1;
        first=temp1;
        second=temp2;
    }
 }

}