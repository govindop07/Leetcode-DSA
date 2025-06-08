class Solution {
    public int scoreOfString(String s) {
        int ans = 0;
        for(int i=1; i<s.length(); i++){
            int diff = 0;
            if(s.charAt(i) > s.charAt(i-1)) diff = s.charAt(i) - s.charAt(i-1); 
            else diff = s.charAt(i-1) - s.charAt(i);
            ans += diff;
        }
        return ans;
    }
}