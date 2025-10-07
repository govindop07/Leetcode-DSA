class Solution {
    public String reverseStr(String s, int k) {
        int idx = 0, n = s.length();
        boolean flag = true;
        StringBuilder ans = new StringBuilder();

        while(idx <= n-k) {
            if(flag) {
                StringBuilder str = new StringBuilder(s.substring(idx, idx+k));
                String reversed = str.reverse().toString();
                ans.append(reversed);
            }
            else ans.append(s.substring(idx, idx+k));

            idx += k;
            flag = !flag;
        }

        StringBuilder str = new StringBuilder(s.substring(idx));
        if(flag) ans.append(str.reverse().toString());
        else ans.append(str);

        return ans.toString();
    }
}