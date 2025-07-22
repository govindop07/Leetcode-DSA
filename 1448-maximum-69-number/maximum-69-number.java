class Solution {
    public int maximum69Number (int num) {
        List<Integer> list = new ArrayList<>();
        while(num > 1) {
            list.add(num%10);
            num /= 10;
        }
        Collections.reverse(list);
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) == 6) {
                list.set(i, 9);
                break;
            }
        }
        StringBuilder s = new StringBuilder();
        for(int item: list) s.append(item);

        return Integer.parseInt(s.toString());
    }
}