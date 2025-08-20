class Solution {
    private int start = 0;
    private int maxLen = 0;

    public String longestPalindrome(String s) {
        int n = s.length();
        if(n <= 1) return s;

        for(int i=0; i<s.length(); i++) {
            expandFromMiddle(s, i, i); // odd
            expandFromMiddle(s, i, i+1); // even
        }

        return s.substring(start, start + maxLen);
    }

    public void expandFromMiddle(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        int curLen = right - left - 1;
        if(curLen > maxLen) {
            maxLen = curLen;
            start = left + 1;
        }
    }
}