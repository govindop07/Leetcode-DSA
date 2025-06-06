class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int maxSoFar = arr[n-1];
        arr[n-1] = -1;

        for(int i=arr.length-2; i>=0; i--){
            int cur = arr[i];
            arr[i] = maxSoFar;
            maxSoFar = Math.max(maxSoFar, cur);
        }
        return arr;
    }
}