/*
     time : O(n^2) ～ O(n^4);
     space : O(n);

     contains 时间：O(n)
     substring 时间：O(n)
*/

class Solution {
    //s = "leetcode",
    //dict = ["leet", "code"]
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }                
            }
        }
        return dp[s.length()];
    }
}