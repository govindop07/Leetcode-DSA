class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans = new ArrayList<>();
        int firstOccurance = -1;

        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;

            if(nums[mid] < target) low = mid+1;
            else {
                firstOccurance = mid;
                high = mid-1;
            }
        }
        if(firstOccurance != -1 && nums[firstOccurance] == target) ans.add(firstOccurance);
        int i = firstOccurance + 1;
        while(i < nums.length && nums[i] == target) {
            ans.add(i);
            i++;
        }

        return ans;
    }
}