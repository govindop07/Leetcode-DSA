class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       long sum=0;
        for(int val:piles){
            sum+=val;
        }
        int start =(int)((sum-1)/h) + 1;
        int end = (int)((sum-piles.length)/(h-piles.length+1)) + 1;
        
        while (start < end) {
            int mid = start + (end - start) / 2;
            int time = 0;
            for (int p : piles) {
                time += (p - 1) / mid + 1;
            }
            if (time > h) {
                start = mid + 1;
            } else {
                
                end = mid;
            }
        }
        return start;

       
    }
}