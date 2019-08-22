//logn, 1
/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int i = 1;
        int j = n;
        while (i + 1 < j) {
            int mid = (j - i) / 2 + i;
            if (guess(mid) == 0) {
                return mid;
            }else if (guess(mid) == 1) {
                i = mid;
            }else {
                j = mid;
            }
        }
        
        return guess(i) == 0 ? i : j;
    }
}
