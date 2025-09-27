class Solution {
    public int maxFreqSum(String s) {
        String ragex = "aeiou";
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int maxVowel = 0, maxConso = 0;
        for(char c: map.keySet()) {
            if(ragex.indexOf(c) != -1) {
                maxVowel = Math.max(maxVowel, map.get(c));
            } else {
                maxConso = Math.max(maxConso, map.get(c));
            }
        }
        return maxVowel + maxConso;
    }
}