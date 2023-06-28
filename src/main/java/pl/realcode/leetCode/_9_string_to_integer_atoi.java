package pl.realcode.leetCode;

public class _9_string_to_integer_atoi {

    public int myAtoi(String s) {
        long result = 0;
        int sign = 0;
        boolean isDigit = false;
        for (char c:
             s.toCharArray()) {
            if (c == ' ') {
                if (isDigit) {
                    break;
                }
                continue;
            }
            if (c == '+') {
                if (sign != 0 || isDigit) {
                    break;
                }
                isDigit = true;
                sign = 1;
                continue;
            }
            if (c == '-') {
                if (sign != 0 || isDigit) {
                    break;
                }
                isDigit = true;
                sign = -1;
                continue;
            }
            if ((c < 48 || c > 57)){
                break;
            }

            isDigit = true;
            result = result * 10 + (c-48);

            if (sign > -1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign < 0 && sign * result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        return (int) (sign != 0 ? sign * result : result);
    }


}
