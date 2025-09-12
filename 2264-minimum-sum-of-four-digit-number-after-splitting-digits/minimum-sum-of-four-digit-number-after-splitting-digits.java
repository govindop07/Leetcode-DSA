class Solution {
    public int minimumSum(int num) {
        String s = String.valueOf(num);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        
        boolean flag = false;
        StringBuilder ans1 = new StringBuilder();
        StringBuilder ans2 = new StringBuilder();
        for(char c: arr) {
            if(flag) ans1.append(c);
            else ans2.append(c);
            flag = !flag;
        }
        return Integer.parseInt(ans1.toString()) + Integer.parseInt(ans2.toString());
    }
}