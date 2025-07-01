/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){ //it reaches before slow and if it is null no cycle
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){ //they will  meet if cycle present
                break;
            }
        }

        if(fast==null || fast.next==null){// nocycle
            return false;
        }

        slow=head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }
}