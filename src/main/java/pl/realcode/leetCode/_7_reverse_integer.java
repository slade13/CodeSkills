package pl.realcode.leetCode;

public class _7_reverse_integer {

    static String intMax = String.valueOf(Integer.MAX_VALUE);
    static String intMin = String.valueOf(Integer.MIN_VALUE);

    public int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        StringBuilder stringValue = new StringBuilder(String.valueOf(x * sign));
        String reversedValue = stringValue.reverse().toString();

        if (reversedValue.length() >= intMax.length() && reversedValue.compareTo(intMax) > 0 ||
        reversedValue.length() >= intMin.length() && reversedValue.compareTo(intMin) < 0) {
            return 0;
        }

        return sign * Integer.parseInt(reversedValue);
    }


}
