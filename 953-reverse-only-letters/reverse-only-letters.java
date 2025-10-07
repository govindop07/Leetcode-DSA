class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder letters = new StringBuilder();
        for(char c: s.toCharArray()) {
            if(Character.isLetter(c)) letters.append(c);
        }

        StringBuilder ans = new StringBuilder();
        int i = letters.length()-1;
        for(char c: s.toCharArray()) {
            if(Character.isLetter(c)) ans.append(letters.charAt(i--));
            else ans.append(c);
        }
        return ans.toString();
    }
}