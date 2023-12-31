package pl.realcode.leetCode;

public class _9_palindrome_number {

    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        int result = 0;
        while (x>result) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        return x == result || x == result / 10;
    }


}
