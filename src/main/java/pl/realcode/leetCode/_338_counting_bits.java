package pl.realcode.leetCode;

public class _338_counting_bits {

    public int[] countBits(int n) {
        int[] result = new int[n+1];

        for (int i = 1; i < n+1; i++) {
            result[i] = countOnes(i);
        }

        return result;
    }

    // too complex
    private int countOnes(int i) {
        int result = 0;
        while (i != 0) {
            result += i & 1;
            i >>= 1;
        }
        return result;
    }


}
