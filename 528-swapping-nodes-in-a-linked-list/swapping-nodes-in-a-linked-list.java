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
    public ListNode swapNodes(ListNode head, int k) {
        int len = findLen(head);
        int first = k;
        int second = len - first;

        ListNode firstElm = head, secondElm = head;
        while(first > 1){
            firstElm = firstElm.next;
            first--;
        }
        while(second > 0){
            secondElm = secondElm.next;
            second--;
        }

        int temp = firstElm.val;
        firstElm.val = secondElm.val;
        secondElm.val = temp;

        return head;
    }

    public int findLen(ListNode head){
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        return len;
    }
}