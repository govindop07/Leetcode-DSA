class Solution {
    public int maxFreqSum(String s) {
        String ragex = "aeiou";
        int[] arr = new int[26];
        for(char c: s.toCharArray()) arr[c-'a']++;

        int maxVowel = 0, maxConso = 0;
        for(int i=0; i<26; i++) {
            char c = (char) (i + 'a');
            if(ragex.indexOf(c) != -1) {
                maxVowel = Math.max(maxVowel, arr[i]);
            } else {
                maxConso = Math.max(maxConso, arr[i]);
            }
        }

        return maxVowel + maxConso;
    }
}