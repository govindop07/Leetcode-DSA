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
    public int[][] spiralMatrix(int rows, int columns, ListNode head) {
        int[][] matrix = new int[rows][columns];
        for(int i=0; i<rows; i++){
            Arrays.fill(matrix[i], -1);
        }

        int topRow = 0, bottomRow = rows-1, leftColumn = 0, rightColumn = columns-1;
        while(head != null){
            // fill top row
            for(int col=leftColumn; col<=rightColumn; col++){
                if(head == null) break;
                matrix[topRow][col] = head.val;
                head = head.next;
            }
            topRow++;

            // fill right col
            for(int row=topRow; row<=bottomRow; row++){
                if(head == null) break;
                matrix[row][rightColumn] = head.val;
                head = head.next;
            }
            rightColumn--;

            // fill bottom row
            for(int col=rightColumn; col>=leftColumn; col--){
                if(head == null) break;
                matrix[bottomRow][col] = head.val;
                head = head.next;
            }
            bottomRow--;

            // fill left col
            for(int row=bottomRow; row>=topRow; row--){
                if(head == null) break;
                matrix[row][leftColumn] = head.val;
                head = head.next;
            }
            leftColumn++;
        }

        return matrix;
    }
}