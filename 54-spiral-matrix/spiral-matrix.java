class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int topRow = 0, bottomRow = matrix.length-1;
        int leftColumn = 0, rightColumn = matrix[0].length-1;
        while(topRow <= bottomRow && leftColumn <= rightColumn){
            // go right
            for(int col=leftColumn; col<=rightColumn; col++){
                ans.add(matrix[topRow][col]);
            }
            topRow++;

            // go bottom
            for(int row=topRow; row<=bottomRow; row++){
                ans.add(matrix[row][rightColumn]);
            }
            rightColumn--;

            if(topRow <= bottomRow){
                // go left
                for(int col=rightColumn; col>=leftColumn; col--){
                    ans.add(matrix[bottomRow][col]);
                }
            }
            bottomRow--;

            if(leftColumn <= rightColumn){
                // go up
                for(int row=bottomRow; row>=topRow; row--){
                    ans.add(matrix[row][leftColumn]);
                }
            }
            leftColumn++;
        }

        return ans;
    }
}