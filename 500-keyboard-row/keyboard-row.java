class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        
        for(String word: words) {
            String lower = word.toLowerCase();
            if(check(lower, first) || check(lower, second) || check(lower, third)) list.add(word);
        }
        return list.toArray(new String[0]);
    }

    public boolean check(String s, String ragex) {
        for(char c: s.toCharArray()) {
            if(ragex.indexOf(c) == -1) return false;
        }
        
        return true;
    }
}