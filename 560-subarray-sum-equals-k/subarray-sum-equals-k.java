class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int preSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int num: nums) {
            preSum += num;
            count += map.getOrDefault(preSum-k, 0);
            map.put(preSum, map.getOrDefault(preSum, 0)+1);
        }

        return count;
    }
}