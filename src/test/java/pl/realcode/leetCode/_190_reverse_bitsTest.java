package pl.realcode.leetCode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class _190_reverse_bitsTest {

    @ParameterizedTest
    @CsvSource({"43261596,964176192", "6343462,1691551232"})
    void testSolution(int input, int result) {
        var solution = new _190_reverse_bits();
        assertEquals(result, solution.reverseBits(input));
    }

}