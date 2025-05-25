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
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        double ans = 0;
        temp = head;
        while(temp != null){
            double value = Math.pow(2, size-1) * temp.val;
            temp = temp.next;
            size--;
            ans = ans + value;
        }

        return (int)ans;
    }
}