class Solution {
    public int minPartitions(String n) {
        int maxDigit = -1;
        
        for(int i=0; i<n.length(); i++){
            if(n.charAt(i) == '9') return 9;

            int curDigit = n.charAt(i) - '0';
            maxDigit = Math.max(maxDigit, curDigit);
        }
        return maxDigit;
    }
}