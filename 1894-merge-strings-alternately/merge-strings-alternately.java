class Solution {
    public String mergeAlternately(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        boolean flag = true;
        while(i < s1.length() && j < s2.length()) {
            if(flag) {
                sb.append(s1.charAt(i++));
                flag = !flag;
            } else {
                sb.append(s2.charAt(j++));
                flag = !flag;
            }
        }
        while(i < s1.length()) sb.append(s1.charAt(i++));
        while(j < s2.length()) sb.append(s2.charAt(j++));

        return sb.toString();
    }
}