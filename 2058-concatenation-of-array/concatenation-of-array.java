class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length, j = 0;
        int[] ans = new int[n*2];

        while(j < n*2) {
            for(int num: nums) ans[j++] = num;
        }
        return ans;
    }
}