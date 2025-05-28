class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = findMax(nums);
        int low = 0, high = max;
        int ans = -1;

        while(low <= high){
            int mid = low + (high-low)/2;
            long sum = findSum(nums, mid);

            if(sum <= threshold){
                high = mid-1;
                ans = mid;
            } else {
                low = mid+1;
            }
        }
        return ans;
    }

    public long findSum(int nums[], int div){
        long sum = 0;
        for(int num: nums){
            sum += Math.ceil((double)(num) / (double)(div));
        }
        return sum;
    }

    public int findMax(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int num: nums){
          max = Math.max(max, num);
        }
        return max;
    }
}