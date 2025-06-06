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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] result = {-1, -1};

        int minDistance = Integer.MAX_VALUE;
        ListNode prev = head, curr = head.next;
        int currIndex = 1;
        Integer prevCriticalIndex = null, firstCriticalIndex = null;

        while (curr.next != null) {
            if (prev.val > curr.val && curr.val < curr.next.val 
            || prev.val < curr.val && curr.val > curr.next.val) {
                
                if (prevCriticalIndex == null) {
                    prevCriticalIndex = currIndex;
                    firstCriticalIndex = currIndex;
                } else {
                    minDistance = Math.min(minDistance, currIndex - prevCriticalIndex);
                    prevCriticalIndex = currIndex;
                }
            }
            currIndex++;
            prev = curr;
            curr = curr.next;
        }

        if (minDistance != Integer.MAX_VALUE) {
            result[0] = minDistance;
            result[1] = prevCriticalIndex - firstCriticalIndex;
        }
        return result;
    }
}