class Solution {
    public int lengthOfLastWord(String s) {
        return s.trim().length() - 1 - s.trim().lastIndexOf(' ');
    }
}


public int lengthOfLastWord(String s) {
        String[] strings = s.split(" ");
        if (strings.length == 0) {
            return 0;
        }
        return strings[strings.length - 1].length();
    }


trim(): delete the beginning ' ' and end ' ' 
