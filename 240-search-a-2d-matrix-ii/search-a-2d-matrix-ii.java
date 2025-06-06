class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int size = matrix.length-1;
        int row = 0;
        int col = matrix[0].length-1;

        while(row <= size && col >= 0){
            int mid = matrix[row][col];

            if(mid == target) return true;
            else if(mid > target) col--;
            else row++;
        }
        return false;
    }
}