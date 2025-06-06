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

    public boolean checkMinDays(int[] nums, int buqt, int flowers, int mid){
        int count = 0, noOfBloomed = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] <= mid){
                count++;
            } else{
                noOfBloomed += (count / flowers);
                count = 0;
            }
        }
        noOfBloomed += (count / flowers);
        return noOfBloomed >= buqt;
    }
}