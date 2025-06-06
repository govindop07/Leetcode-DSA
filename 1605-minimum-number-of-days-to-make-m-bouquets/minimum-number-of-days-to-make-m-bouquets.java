class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;
        if (val > bloomDay.length) return -1;

        int max = Integer.MIN_VALUE;
        for(int num: bloomDay) max = Math.max(max, num);

        int low = 0, high = max;
        while(low <= high){
            int mid = low + (high-low)/2;

            if(checkMinDays(bloomDay, m, k, mid)) high = mid-1;
            else low = mid+1;
        }
        return low;
    }

    public boolean checkMinDays(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int flowers = 0;
        for (int bloom : bloomDay) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                    if (bouquets >= m) return true;
                }
            } else {
                flowers = 0;
            }
        }
        return bouquets >= m;
    }
}