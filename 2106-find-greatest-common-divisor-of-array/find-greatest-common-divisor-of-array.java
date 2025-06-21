class Solution {
    public int findGCD(int[] nums) {
        int smallest = Integer.MAX_VALUE, largest = Integer.MIN_VALUE;
        for(int num: nums) {
            smallest = Math.min(num, smallest);
            largest = Math.max(num, largest);
        }

        int gcd = findGCD(smallest, largest);
        return gcd;
    }

    public int findGCD(int min, int max) {
        for(int i=min; i>=1; i--){
            if(min % i == 0 && max % i == 0) return i;
        }
        return 1;
    }
}