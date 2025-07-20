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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head.next; //2-->3-->4
        head.next=swapPairs(temp.next);
        temp.next=head;
        return temp;
    }
}

/*
head
1--->2-->3-->4 --given

2-->1-->     4-->3 --result
*/

