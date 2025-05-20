class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount = 0;
        for(int num: nums){
            if(num == 0) {
                zeroCount++;
                continue;
            }
            product *= num;
        }

        System.out.println(zeroCount);

        int[] ans = new int[nums.length];
        for(int i=0; i<ans.length; i++){
            if(zeroCount > 1){ // every index is zero
                ans[i] = 0;
            }else if(zeroCount == 1) { //rest will be multiplied with zero
                ans[i] = (nums[i] == 0) ? product : 0;
            } else {
                ans[i] = product/nums[i];
            }
        }

        return ans;
    }
}