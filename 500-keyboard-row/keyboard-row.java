class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        
        for(String word: words) {
            if(check(word, first) || check(word, second) || check(word, third)) list.add(word);
        }
        return list.toArray(new String[0]);
    }

    public boolean check(String s, String ragex) {
        String capitalRagex = ragex.toUpperCase();
        for(char c: s.toCharArray()) {
            if(ragex.indexOf(c) == -1 && capitalRagex.indexOf(c) == -1) return false;
        }
        
        return true;
    }
}