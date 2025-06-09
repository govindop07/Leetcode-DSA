class Solution {
    public int smallestEvenMultiple(int n) {
        int ans = 2;
        while(ans % n != 0){
            ans += 2;
        }
        return ans;
    }
}