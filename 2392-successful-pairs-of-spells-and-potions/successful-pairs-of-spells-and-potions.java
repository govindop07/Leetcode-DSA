class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int m = spells.length;
        int output[] = new int[m];
        Arrays.sort(potions);

        for(int i=0; i<m; i++){
            int successfulPairs = checkSuccessfulPairs(spells[i], potions, success);
            output[i] = successfulPairs;
        }
        return output;
    }

    public int checkSuccessfulPairs(int mul, int[] nums, long target){
        int low = 0, high = nums.length-1;
        
        while(low <= high){
            int mid = low + (high-low)/2;
            long product = (long) nums[mid]*mul;

            if(product >= target) high = mid-1;
            else low = mid+1;
        }
        return nums.length-low;
    }
}