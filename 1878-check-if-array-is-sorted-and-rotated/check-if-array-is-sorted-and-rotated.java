class Solution {
    public boolean check(int[] nums) {
        boolean rotationDetected = false;
        for(int i=1; i<nums.length; i++){
            if(nums[i] < nums[i-1]){
                if(rotationDetected == true) return false;
                rotationDetected = true;
            }
        }

        return !rotationDetected || nums[nums.length-1] <= nums[0];
    }
}