//n, n
class Solution {
    public String removeDuplicateLetters(String s) {
        if (s == null || s.length() == 0) return "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }
        
        int start = 0;
        int end = findMinLastPos(map);
        char[] res = new char[map.size()];
        
        for (int i = 0; i < res.length; i++) {
            char minChar = 'z' + 1;
            for (int k = start; k <= end; k++) {
                if (map.containsKey(s.charAt(k)) && s.charAt(k) < minChar) {
                    minChar = s.charAt(k);
                    start = k + 1;
                }
            }
            
            res[i] = minChar;
            map.remove(minChar);
            if (s.charAt(end) == minChar) {
                end = findMinLastPos(map);
            }
        }
        
        return new String(res); //
    }
    
    public int findMinLastPos(HashMap<Character, Integer> map) {
        int res = Integer.MAX_VALUE;
        for (int num : map.values()) {
            res = Math.min(res, num);
        }
        
        return res;
    }
}
