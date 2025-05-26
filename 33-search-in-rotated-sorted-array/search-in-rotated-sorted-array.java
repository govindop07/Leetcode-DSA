class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;

        while(left <= right){
            int mid = left + (right-left)/2;
            System.out.println("mid: " + mid);
            if(nums[mid] == target) return mid;

            // if left part of the array is sorted
            if(nums[left] <= nums[mid]){
                if(nums[mid] >= target && nums[left] <= target){
                    right = mid-1;
                } else left = mid+1;
            }

            // if right part of the array is sorted
            else {
                if(nums[mid] <= target && target <= nums[right]){
                    left = mid+1;
                } else right = mid-1;
            }
        }

        return -1;
    }
}