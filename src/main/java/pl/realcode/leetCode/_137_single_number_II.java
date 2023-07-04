package pl.realcode.leetCode;

public class _137_single_number_II {

    public int singleNumber(int[] nums) {
        int size = 32;
        int[] bits = new int[size];
        for (int num : nums) {
            countBits(bits, num);
        }
        int result = 0;
        for (int i = size-1; i >= 0; i--) {
            result <<= 1;
            result |= (bits[i] % 3) & 1;
        }
        return result;
    }

    private void countBits(int[] bits, int num) {
        int i = 0;
        while (num != 0) {
            bits[i++] += num & 1;
            num >>>= 1;
        }
    }


}
