package pl.realcode.leetCode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class _8_string_to_integer_atoiTest {
    @ParameterizedTest
    @CsvSource({"0032,32", " -123 b,-123", "42,42", "-42,-42", "4193 with words,4193", "-91283472332,-2147483648", "+-12,0", "21474836460,2147483647", "00000-42a1234,0", "   +0 123,0","2147483648,2147483647", "  +  413,0"})
    void testSolution(String input, int result) {
        var solution = new _8_string_to_integer_atoi();
        assertEquals(result, solution.myAtoi(input));
    }
}