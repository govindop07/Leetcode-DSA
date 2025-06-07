class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int row = 0;
        int col = cols-1;

        int ans = 0;
        while(row < rows && col >= 0){
            if(grid[row][col] < 0){
                ans += rows-row;
                col--;
            } else {
                row++;
            }
        }
        return ans;
    }
}