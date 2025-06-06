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
    public ListNode[] splitListToParts(ListNode head, int k) {
        int size = getSize(head);
        ListNode[] ans = new ListNode[k];
        int splitSize = size / k;
        int numRemainingParts = size % k;
        
        ListNode cur = head, prev = head;
        for(int i=0; i<k; i++){
            ListNode newPart = cur;
            int curSize = splitSize;
            if(numRemainingParts > 0){
                numRemainingParts--;
                curSize++;
            }

            // traverse to the end of the new part
            int j = 0;
            while(j < curSize){
                prev = cur;
                cur = cur.next;
                j++;
            }

            // cut off the rest of the linked list
            if(prev != null) prev.next = null;
            ans[i] = newPart;
        }

        return ans;
    }

    public static int getSize(ListNode head){
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }
}