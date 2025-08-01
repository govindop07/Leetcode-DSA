class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] ans = new int[n];
        
        for(int i=0; i<n; i++){
            int cost = 0;
            for(int j=0; j<n; j++){
                if(boxes.charAt(j) == '1') {
                    cost += Math.abs(i-j);
                }
            }
            ans[i] = cost;
        }
        return ans;
    }
}