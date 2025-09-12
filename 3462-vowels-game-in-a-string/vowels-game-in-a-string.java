class Solution {
    public boolean doesAliceWin(String s) {
        String ragex = "aeiou";
        for(char c: s.toCharArray()) {
            if(ragex.indexOf(c) != -1) return true;
        }
        return false;
    }
}