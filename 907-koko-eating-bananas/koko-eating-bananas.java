class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int num: piles)  max = Math.max(max, num);

        int low = 1, high = max;

        while(low <= high){
            int mid = low + (high-low)/2;
            
            if(canEatInTime(piles, mid, h)) high = mid-1;
            else low = mid+1;
        }

        return low;
    }

    public boolean canEatInTime(int[] nums, int k, int h){
        long totalHours = 0;

        for(int num: nums){
            int div = num/k;
            totalHours += div;
            if(num % k != 0) totalHours++;
        }

        return totalHours <= h;
    }
}