import java.util.*;
class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: nums) list.add(num);

        int steps = 0;
        while(!isSorted(list)){
            removeMinPair(list);
            steps++;
        }

        return steps;
    }

    public boolean isSorted(ArrayList<Integer> list){
        for(int i=1; i<list.size(); i++){
            if(list.get(i) < list.get(i-1)) return false;
        }

        return true;
    }

    public void removeMinPair(ArrayList<Integer> list){
        int minPair = list.get(0) + list.get(1);
        int minIdx = 1;

        for(int i=1; i < list.size(); i++){
            int sum = list.get(i-1) + list.get(i);
            if(sum < minPair){
                minIdx = i;
                minPair = sum;
            }
        }

        list.set(minIdx-1, minPair);
        list.remove(minIdx);
    }
}