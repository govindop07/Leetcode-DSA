class Solution {
    public int countPairs(List<Integer> nums, int target) {
        if(nums.size() < 2) return -1;
        int left = 0, right = 1;
        int ans = 0;
        while(left < nums.size()){
            right = left+1;
            while(right < nums.size()){
                if(nums.get(left) + nums.get(right) < target) ans++;
                right++;
            }
            left++;
        }
        return ans;
    }
}