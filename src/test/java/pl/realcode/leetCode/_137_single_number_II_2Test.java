package pl.realcode.leetCode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _137_single_number_II_2Test {

    @ParameterizedTest
    @CsvSource({"2;2;3;2,3",
            "0;1;0;1;0;1;99,99",
            "-2;-2;1;1;4;1;4;4;-4;-2,-4",
            "43;16;45;89;45;-2147483648;45;2147483646;-2147483647;-2147483648;43;2147483647;-2147483646;-2147483648;89;-2147483646;89;-2147483646;-2147483647;2147483646;-2147483647;16;16;2147483646;43,2147483647"
    })
    void testSolution(String prices, int n) {
        int[] output = Arrays.stream(prices.split(";")).mapToInt(Integer::parseInt).toArray();
        var solution = new _137_single_number_II_2();
        assertEquals(n, solution.singleNumber(output));
    }

}