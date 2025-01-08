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

   public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode prev=null;
        ListNode fast=head;
        ListNode slow=head;
        

        while(fast!=null && fast.next!=null){
            prev=slow;
            fast=fast.next.next;
            slow=slow.next;
           
        }

        prev.next=prev.next.next;
        return head;

    }
}


    /*public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            length++;
        }

        temp=head;
    for(int i=0;i<length/2-1;i++){
        temp=temp.next;
    }
    ListNode del=temp;
    del.next=del.next.next;
    return head;
    }
}*/