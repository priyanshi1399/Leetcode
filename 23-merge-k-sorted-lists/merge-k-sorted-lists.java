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
   public ListNode mergeKLists(ListNode[] lists) {
    if (lists == null || lists.length == 0) { // first check if list is null or empty
        return null;
    }

    // Min-Heap (PriorityQueue) — it will sort nodes in ascending order by their value
    PriorityQueue<ListNode> pq = new PriorityQueue<>(lists.length, (a, b) -> Integer.compare(a.val, b.val));

    ListNode res = new ListNode(-1); // dummy node to start the merged list
    ListNode tail = res;             // tail pointer to track the last node of merged list

    // Add the first node of each list into priority queue
    for (ListNode node : lists) {
        if (node != null) {
            pq.add(node);
        }
    }

    // Keep removing the smallest node from PQ and attach it to the tail
    while (!pq.isEmpty()) {
        tail.next = pq.poll(); // pick smallest node and link to tail
        tail = tail.next;      // move tail ahead

        // If the current list still has remaining nodes, add its next node to PQ
        if (tail.next != null) {
            pq.add(tail.next);
        }
    }

    // return the merged list (ignore dummy node)
    return res.next;
}
}