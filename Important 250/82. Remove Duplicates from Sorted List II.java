//n, 1
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int same = cur.next.val;
                while (cur.next != null && cur.next.val == same) {
                    cur.next = cur.next.next;
                }
            }else {
                cur = cur.next;
            }
        }
        
        return dummy.next;
    }
}
