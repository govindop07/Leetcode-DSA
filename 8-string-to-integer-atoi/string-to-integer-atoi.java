class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int sign = 1, i = 0;
        long ans = 0;

        if(s.length() == 0) return 0;
        
        if(s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if(s.charAt(0) == '+') i++;

        while(i < s.length()) {
            char c = s.charAt(i);
            if(c < '0' || c > '9') break;

            ans = ans * 10 + (c - '0');
            if(sign * ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign * ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;

            i++;
        }
       
        return (int) (sign * ans);
    }
}