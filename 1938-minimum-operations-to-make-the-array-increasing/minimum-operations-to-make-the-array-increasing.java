class Solution {
    public int minOperations(int[] nums) {
        if(nums.length == 1) return 0;
        
        int ans = 0;
        for(int i=1; i<nums.length; i++){
            int num = nums[i];
            nums[i] = Math.max(nums[i-1]+1, nums[i]);
            ans += Math.abs(num - nums[i]);
        }
        return ans;
    }
}