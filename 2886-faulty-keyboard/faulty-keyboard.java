class Solution {
    public String finalString(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'i') ans.reverse();
            else ans.append(c);
        }
        return ans.toString();
    }
}