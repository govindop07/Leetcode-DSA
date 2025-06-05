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
    public ListNode doubleIt(ListNode head) {
        ListNode cur = head;

        if(head.val >= 5){
            ListNode temp = new ListNode(0);
            temp.next = head;
            head = temp;
            cur = temp;
        }
        
        while(cur != null){
            cur.val = (cur.val * 2) % 10;
            if(cur.next != null && cur.next.val >= 5) {
                cur.val++;
            }
            
            cur = cur.next;
        }
        return head;
    }
}