package pl.realcode.leetCode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


class _714_Best_Time_to_Buy_and_Sell_Stock_with_Transaction_FeeTest {

    @ParameterizedTest
    @CsvSource({"1;3;2;8;4;9,2,8", "1;3;7;5;10;3,3,6"})
    void testSolution(String prices, int fee, int output) {
        int[] pricesInt = Arrays.stream(prices.split(";")).mapToInt(Integer::parseInt).toArray();
        var solution = new _714_Best_Time_to_Buy_and_Sell_Stock_with_Transaction_Fee();
        assertEquals(output, solution.maxProfit(pricesInt, fee));
    }

}