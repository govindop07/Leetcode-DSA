class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;
        StringBuilder sb = new StringBuilder(s);

        for(int i=0; i<s.length(); i++) {
            sb.append(s.charAt(i));
            String str = sb.substring(i+1, sb.length());
            if(str.equals(goal)) return true;
        }
        return false;
    }
}