class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        boolean vowelExist = false, consonentExist = false;
        
        for(char c: word.toCharArray()) {
            if(Character.isLetter(c)) {
                String ragex = "aeiouAEIOU";
                if(ragex.indexOf(c) != -1) vowelExist = true;
                else consonentExist = true;
            }
            else if(!Character.isDigit(c)) return false;
        }
        
        return vowelExist && consonentExist ? true : false;
    }
}