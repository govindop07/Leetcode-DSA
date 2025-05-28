class Solution {
    public int minimumLength(String s) {
        int n = s.length(), ans = 0;
        int count[] = new int[26];
        for(int i=0; i<n; i++) count[s.charAt(i)-'a']++;

        for(int frequency: count){
            if(frequency == 0) continue;
            if(frequency % 2 == 0) ans += 2;
            else ans++;
        }
        return ans;
    }
}