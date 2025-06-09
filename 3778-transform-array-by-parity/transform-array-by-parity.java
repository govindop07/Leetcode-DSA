class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];

        int low = 0, high = nums.length-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] % 2 == 0) ans[low++] = 0;
            else ans[high--] = 1;
        }
        return ans;
    }
}