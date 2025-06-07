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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode cur = list1;
        int idx = 0;
        while(idx < a-1){
            cur = cur.next;
            idx++;
        }

        ListNode front = cur;
        while(idx < b+1){
            cur = cur.next;
            idx++;
        }
        ListNode rear = cur;

        ListNode secondListTail = list2;
        while(secondListTail.next != null){
            secondListTail = secondListTail.next;
        }

        front.next = list2;
        secondListTail.next = rear;
        return list1;
    }
}