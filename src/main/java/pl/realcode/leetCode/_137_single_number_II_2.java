package pl.realcode.leetCode;

public class _137_single_number_II_2 {

    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0, threes;
        for (int num : nums) {
            twos |= ones & num;
            ones ^= num;
            threes = ones & twos;

            ones &= ~threes;
            twos &= ~threes;
        }

        return ones;
    }


}
