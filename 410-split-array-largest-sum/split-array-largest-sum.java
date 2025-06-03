class Solution {
    public int splitArray(int[] nums, int k) {
        long max = 0, sum = 0;
        for(int num: nums){
            max = Math.max(num, max);
            sum += num;
        }

        long low = max, high = sum;
        while(low <= high){
            long mid = low + (high-low)/2;
            
            if(valid(nums, mid, k)){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return (int)low;
    }

    public boolean valid(int[] nums, long target, int k){
        int count = 1;
        long total = 0;

        for(int num: nums){
            total += num;
            if(total > target){
                total = num;
                count++;
                if(count > k){
                    return false;
                }
            }
        }
        return true;
    }
}