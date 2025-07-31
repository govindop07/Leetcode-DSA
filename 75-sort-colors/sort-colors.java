class Solution {
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
    }

    public void swap(int[] nums, int low, int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
}