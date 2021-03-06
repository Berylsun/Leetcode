class Solution {
    /**
     * O(n)
     * O(n)
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        if (s == null || s.length() == 0) return s;
        String[] strs = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = strs.length - 1; i >= 0; i--) {
            sb.append(strs[i]).append(" ");
        }
        return sb.toString().trim();
    }
}