package pl.realcode.leetCode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class _7_reverse_integerTest {

    @ParameterizedTest
    @CsvSource({"123,321", "-123,-321", "120,21"})
    void testSolution(int input, int result) {
        var solution = new _7_reverse_integer();
        assertEquals(result, solution.reverse(input));
    }

}