class Solution {
    public boolean isPalindrome(String s) {
        
        if(s.isEmpty()){
            return true;
        }

        int start = 0, last = s.length()-1;
        while(start <= last){
            char l = Character.toLowerCase(s.charAt(start));
            char r = Character.toLowerCase(s.charAt(last));

            if(!Character.isLetterOrDigit(l)) {
                start++;
                continue;
            }
            else if(!Character.isLetterOrDigit(r)) {
                last--;
                continue;
            }
            else if(l != r) return false;

            start++; last--;
        }

        return true;
    }
}