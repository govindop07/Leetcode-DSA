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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next == null) return head;

        ListNode first = head, second = head.next;
        while(second != null){
            int gcd = findGCD(first.val, second.val);
            ListNode gcdNode = new ListNode(gcd);
            gcdNode.next = second;
            first.next = gcdNode;

            first = second;
            second = second.next;
        }
        return head;
    }

    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}