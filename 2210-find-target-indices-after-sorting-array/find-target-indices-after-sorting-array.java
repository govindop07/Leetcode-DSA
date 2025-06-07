class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int count = 0, lessThanTarget = 0;

        for(int num: nums){
            if(num == target) count++;
            else if(num < target) lessThanTarget++;
        }

        for(int i=0; i<count; i++) ans.add(lessThanTarget++);

        return ans;
    }
}