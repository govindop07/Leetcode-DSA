class Solution {
    public String reverseVowels(String s) {
        StringBuilder vowels = new StringBuilder();
        String ragex = "aeiouAEIOU";
        for(char c: s.toCharArray()) {
            if(ragex.indexOf(c) != -1) vowels.append(c);
        }

        StringBuilder ans = new StringBuilder();
        int i = vowels.length()-1;
        for(char c: s.toCharArray()) {
            if(ragex.indexOf(c) != -1) ans.append(vowels.charAt(i--));
            else ans.append(c);
        }
        return ans.toString();
    }
}