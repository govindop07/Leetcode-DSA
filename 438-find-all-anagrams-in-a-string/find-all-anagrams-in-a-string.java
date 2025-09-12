class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<=s.length()-p.length(); i++) {
            boolean ana = checkAna(s, i, p);
            if(ana) ans.add(i);
        }
        return ans;
    }

    private boolean checkAna(String str, int idx, String p) {
        int[] count = new int[256];
        for(char i: p.toCharArray()) count[i]++;
        for(int i=idx; i<idx+p.length(); i++) {
            count[str.charAt(i)]--;
        }

        for(int i: count) {
            if(i != 0) return false;
        }

        return true;
    }
}