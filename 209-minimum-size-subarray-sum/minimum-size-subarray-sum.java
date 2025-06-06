class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int first = 0, last = 0;
        int sum = 0, min = Integer.MAX_VALUE;

        while(last < nums.length){
            sum += nums[last++];

            while(sum >= target){
                min = Math.min(min, last-first);
                sum -= nums[first++];
                if(sum == 0) return 1;
            }
        }
        if(min == Integer.MAX_VALUE) return 0;
        return min;
    }
}