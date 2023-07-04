package pl.realcode.leetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

class _338_counting_bitsTest {

    @ParameterizedTest
    @CsvSource({"0;1;1,2", "0;1;1;2;1;2,5"})
    void testSolution(String prices, int n) {
        int[] output = Arrays.stream(prices.split(";")).mapToInt(Integer::parseInt).toArray();
        var solution = new _338_counting_bits();
        Assertions.assertArrayEquals(output, solution.countBits(n));
    }
}