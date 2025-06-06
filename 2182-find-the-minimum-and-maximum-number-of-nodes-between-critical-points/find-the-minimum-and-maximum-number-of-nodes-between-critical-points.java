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
        if(head == null || head.next == null || head.next.next == null){
            return new int[]{-1,-1};
        }

        List<Integer> list = new ArrayList<>();
        ListNode prev = head;
        int pos = 1;

        while(prev.next != null){
            ListNode cur = prev.next;

            if(cur.next != null){
                if(prev.val < cur.val && cur.val > cur.next.val) list.add(pos);
                if(prev.val > cur.val && cur.val < cur.next.val) list.add(pos);
            }
            
            prev = prev.next;
            pos++;
        }

        if(list.size() < 2){
            return new int[]{-1,-1};
        } 
        System.out.println(list);

        int minDistance = Integer.MAX_VALUE;
        int maxDistance = list.get(list.size()-1) - list.get(0);

        for(int i=1; i<list.size(); i++){
            int curDistance = list.get(i) - list.get(i-1);
            minDistance = Math.min(minDistance, curDistance);
        }

        return new int[]{minDistance, maxDistance};
    }
}