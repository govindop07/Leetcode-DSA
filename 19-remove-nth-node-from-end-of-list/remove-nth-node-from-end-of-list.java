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
        if(head.next == null && n == 1) return null; 

        ListNode temp = head;
        int len = 0;
        while(temp != null) {
            len++;
            temp = temp.next;
        }

        temp = head;
        int target = len - n;
        while(target-- > 1) {
            temp = temp.next;
        }
        System.out.println(target);
        if(target == -1){
            head = head.next;
            return head;
        }
        if(temp.next != null) temp.next = temp.next.next;

        return head;
    }
}