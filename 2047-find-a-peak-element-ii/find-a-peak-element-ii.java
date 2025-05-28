class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat[0].length;
        int n = mat.length;

        int low = 0, high = m-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            int max = findMax(mat, mid, n);
            int left = mid-1 >= 0 ? mat[max][mid-1] : -1;
            int right = mid+1 < m ? mat[max][mid+1] : -1;

            if(left < mat[max][mid] && mat[max][mid] > right) return new int[]{max, mid};
            else if(left > mat[max][mid]) high = mid-1;
            else low = mid+1;
        }

        return new int[]{-1,-1};
    }

    public int findMax(int[][] mat, int col, int n){
        int max = -1;
        int idx = 1;

        for(int i=0; i<n; i++){
            if(mat[i][col] > max){
                max = mat[i][col];
                idx = i;
            }
        }
        return idx;
    }
}