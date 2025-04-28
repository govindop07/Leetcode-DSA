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
        ListNode f = head;
        int size = 0;
        while(f != null){
            f = f.next;
            size++;
        }

        int target = size - n;

        if(head == null || head.next == null || target == 0){
            head = head.next;
            return head;
        }

        f = head;
        while(target > 1){
            f = f.next;
            target--;
        }
        f.next = f.next.next;
        return head;
    }
}