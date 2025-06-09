class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int prevValue = 0;

        for(char c: s.toCharArray()) {
            int curValue = getValue(c);

             if (curValue > prevValue) {
                ans += (curValue - 2 * prevValue); 
            } else {
                ans += curValue;
            }
            
            prevValue = curValue;
        }

        return ans;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}