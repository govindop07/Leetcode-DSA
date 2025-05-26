class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length-1;

        while(left <= right){
            int mid = (right+left)/2;
            if(nums[mid] == target) return true;

            // if a[low] = a[mid] = a[high]
            else if(nums[left] == nums[mid] && nums[mid] == nums[right]){
                left++;
                right--;
            }

            // left half is sorted
            else if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target <= nums[mid]){
                    right = mid-1;
                } else left = mid+1;
            }

            // right half is sorted
            else{
                if(nums[mid] <= target && target <= nums[right]){
                    left = mid+1;
                } else right = mid-1;
            }
        }
        return false;
    }
}