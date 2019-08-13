class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        int cur = 1;
        for (int i = 0; i < n; i++) {
            res.add(cur);
            if (cur * 10 <= n) {
                cur *= 10;
            }else if (cur % 10 < 9 && cur + 1 <= n) {
                cur++;
            }else {
                while ((cur / 10) % 10 == 9) { //保证消掉所有的9
                    cur /= 10;
                }
                cur = cur / 10 + 1; //保证cur小于n
            }
        }
        return res;
    }
}
