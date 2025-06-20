class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = height.length-1, maxAr = 0;

        while(left != right){
            int currAr = Math.min(height[left],height[right]) * (right-left);
            maxAr = Math.max(currAr, maxAr);

            if(height[left] > height[right]){
                right--;
            } else {
                left++;
            }
        }

        return maxAr;
    }
}