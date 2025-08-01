class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int ans = nums[0];

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == ans) count++;
            else if(nums[i] != ans) count--;
            if(count < 0) {
                ans = nums[i];
                count = 0;
            }
        }
        return ans;
    }
}