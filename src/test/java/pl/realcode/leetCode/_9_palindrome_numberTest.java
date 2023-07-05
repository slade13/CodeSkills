package pl.realcode.leetCode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class _9_palindrome_numberTest {

    @ParameterizedTest
    @CsvSource({"121,true",
                "-121, false",
                "10, false"
    })
    void testSolution(int input, boolean result) {
        var solution = new _9_palindrome_number();
        assertEquals(result, solution.isPalindrome(input));
    }
}