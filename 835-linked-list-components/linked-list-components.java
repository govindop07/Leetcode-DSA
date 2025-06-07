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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for(int num: nums) hashSet.add(num);

        int component = 0;
        boolean inComponent = false;
        while(head != null){
            if(hashSet.contains(head.val)){
                if(!inComponent){
                    component++;
                    inComponent = true;
                }
            } else {
                inComponent = false;
            }
            head = head.next;
        }
        return component;
    }
}