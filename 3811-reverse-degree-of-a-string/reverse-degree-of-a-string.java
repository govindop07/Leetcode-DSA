class Solution {
    public int reverseDegree(String s) {
        int ans = 0;
        for(int i=1; i<=s.length(); i++) {
            char c = s.charAt(i-1);
            int originalPosition = c - 'a';
            int reversedPosition = (26 - originalPosition);
            ans += reversedPosition * i;
        }
        return ans;
    }
}