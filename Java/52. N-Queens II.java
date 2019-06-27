//n^n, n
class Solution {
    int res = 0;
    public int totalNQueens(int n) {
        if (n <= 0) return 0;
        boolean[] cols = new boolean[n];
        boolean[] d1 = new boolean[2 * n];
        boolean[] d2 = new boolean[2 * n];
        helper(0, cols, d1, d2, n);
        return res;
    }
    
    public void helper(int rows, boolean[] cols, boolean[] d1, boolean[] d2, int n) {
        if (rows == n) {
            res++;
            return;
        }
        
        for (int col = 0; col < n; col++) {
            int id1 = rows - col + n;
            int id2 = rows + col;
            if (cols[col] || d1[id1] || d2[id2]) continue;
            cols[col] = true;
            d1[id1] = true;
            d2[id2] = true;
            helper(rows + 1, cols, d1, d2, n);
            cols[col] = false;
            d1[id1] = false;
            d2[id2] = false;
        }
    }
}