class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int start = 0;
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == ' ' || i == s.length()-1) {
                String str = s.substring(start, i);
                if(i == s.length()-1) str = s.substring(start, i+1);
                String rev = new StringBuilder(str).reverse().toString();
                ans.append(rev);
                start = i+1;
                if(i < s.length()-1) ans.append(" ");
            }
        }

        return ans.toString();
    }
}