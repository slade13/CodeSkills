package pl.realcode.leetCode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class _7_reverse_integerTest_2 {

    @ParameterizedTest
    @CsvSource({"123,321", "-123,-321", "120,21",  "-2147483648,0", "2147483647,0", "1534236469,0", "-2147483412, -2143847412"})
    void testSolution(int input, int result) {
        var solution = new _7_reverse_integer_2();
        assertEquals(result, solution.reverse(input));
    }

}

