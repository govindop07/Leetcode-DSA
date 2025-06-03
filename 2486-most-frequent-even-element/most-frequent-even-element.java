class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int val = 1000000, freq = 0;
        for(int num: nums){
            if(num % 2 == 0){
                int cur = map.getOrDefault(num, 0)+1;
                map.put(num, cur);

                if(cur>freq || cur==freq && num<val){
                    val = num;
                    freq = cur;
                }
            }
        }
        return freq==0? -1: val;
    }
}