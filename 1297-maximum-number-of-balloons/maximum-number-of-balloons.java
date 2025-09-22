class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        for(char ch: text.toCharArray()) {
            if(ch == 'b') b++;
            if(ch == 'a') a++;
            if(ch == 'l') l++;
            if(ch == 'o') o++;
            if(ch == 'n') n++;
        }

        int min = Math.min(l/2, o/2);
        int sMin = Math.min(b, Math.min(a, n));
        return Math.min(min, sMin);
    }
}