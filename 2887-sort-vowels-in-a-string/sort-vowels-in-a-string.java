class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> vowels = new ArrayList<>();
        String ragex = "AEIOUaeiou";

        for(char c: s.toCharArray()) {
            if(ragex.indexOf(c) != -1) vowels.add(c);
        }
        Collections.sort(vowels);

        StringBuilder ans = new StringBuilder();
        int idx = 0;
        for(char c: s.toCharArray()) {
            if(ragex.indexOf(c) != -1) ans.append(vowels.get(idx++));
            else ans.append(c);
        }
        return ans.toString();
    }
}