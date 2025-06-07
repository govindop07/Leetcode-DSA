class Solution {
    public int maximumCount(int[] nums) {
        int negCount = binarySearch(nums, 0);
        int posCount = nums.length - binarySearch(nums, 1);
        return Math.max(negCount, posCount);
    }

    public int binarySearch(int[] nums, int target){
        int low = 0, high = nums.length-1;
        int ans = nums.length;
        
        while(low <= high){
            int mid = low + (high-low)/2;

            if(nums[mid] < target) low = mid+1;
            else {
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
    }
}