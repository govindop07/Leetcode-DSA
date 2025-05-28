class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        int low = 1, high = x/2;

        while(low <= high){
            int mid = low + (high-low)/2;
            long sq = (long)mid*mid;

            if(sq == x) return mid;
            if(sq < (x)) low = mid+1;
            else high = mid-1;
        }
        return high;
    }
}