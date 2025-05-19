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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ans = new ListNode(1000, head); // if the first element is also a duplicate
        ListNode curr = ans;
        while(curr.next != null && curr.next.next != null){
            if(curr.next.val == curr.next.next.val){
                int val = curr.next.val;
                while(curr.next != null && curr.next.val == val){
                    curr.next = curr.next.next;
                }
            } else {
                curr = curr.next;
            }
        }

        return ans.next;
    }
}