package pl.realcode.leetCode;

public class _338_counting_bits_2 {

    public int[] countBits(int n) {
        int[] result = new int[n+1];

        count(result, n, 1, 1);

        return result;
    }

    // too complex
    private void count(int[] result, int n, int i, int value) {
        if (i > n) {
            return;
        }
        result[i] = value;
        count(result, n, i << 1, value);
        count(result, n, (i << 1) + 1, value + 1);
    }


}
