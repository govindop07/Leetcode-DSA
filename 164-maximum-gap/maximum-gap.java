class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length < 2) return 0;
        Arrays.sort(nums);
        int maxDiff = Integer.MIN_VALUE;

        for(int i=1; i<nums.length; i++) {
            int diff = Math.abs(nums[i] - nums[i-1]);
            maxDiff = Math.max(maxDiff, diff);
        }
        return maxDiff;
    }
}