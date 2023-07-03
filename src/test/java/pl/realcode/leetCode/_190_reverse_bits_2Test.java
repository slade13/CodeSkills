package pl.realcode.leetCode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class _190_reverse_bits_2Test {

    @ParameterizedTest
    @CsvSource({"43261596,964176192", "6343462,1691551232", "14,1879048192"})
    void testSolution(int input, int result) {
        var solution = new _190_reverse_bits_2();
        assertEquals(result, solution.reverseBits(input));
    }
}