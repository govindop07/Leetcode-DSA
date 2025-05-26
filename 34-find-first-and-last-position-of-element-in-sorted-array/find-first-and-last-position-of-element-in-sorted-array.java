class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    public int findFirst(int[] nums, int target){
        int left = 0, right = nums.length-1;
        int first = -1;

        while(right >= left){
            int mid = left + (right-left)/2;

            if(nums[mid] == target){
                first = mid;
                right = mid-1;
            }
            else if (nums[mid] > target) right = mid-1;
            else left = mid+1;
        }

        return first;
    }

    public int findLast(int[] nums, int target){
        int left = 0, right = nums.length-1;
        int last = -1;

        while(right >= left){
            int mid = left + (right-left)/2;

            if(nums[mid] == target){
                last = mid;
                left = mid+1;
            }
            else if (nums[mid] > target) right = mid-1;
            else left = mid+1;
        }

        return last;
    }
}