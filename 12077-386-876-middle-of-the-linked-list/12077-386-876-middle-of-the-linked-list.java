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

        public ListNode middleNode(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}


    /*public ListNode middleNode(ListNode head) {
        int length=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            length++;
        }

        temp=head;
        for(int i=0;i<length/2;i++){
            temp=temp.next;
        }
        return temp;
    }
}*/
