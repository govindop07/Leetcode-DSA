class Solution {
    public String reverseWords(String s) {
        int n = s.length(), i = n - 1;
        StringBuilder ans = new StringBuilder();

        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--; // Skip trailing spaces
            if (i < 0) break;
            int j = i;
            while (i >= 0 && s.charAt(i) != ' ') i--; // Find start of word
            ans.append(s.substring(i + 1, j + 1)).append(' ');
        }

        if (ans.length() > 0) ans.setLength(ans.length() - 1); // Remove trailing space
        return ans.toString();
    }
}
