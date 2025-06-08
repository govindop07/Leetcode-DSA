class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];
        int low = 0, high = n-1;

        for(int i=0, j=n-1; i<n; i++, j--){
            if(nums[i] < pivot){
                ans[low++] = nums[i];
            }
            if(nums[j] > pivot){
                ans[high--] = nums[j];
            }
        }
        
        while(low <= high) ans[low++] = pivot;
        return ans;
    }
}