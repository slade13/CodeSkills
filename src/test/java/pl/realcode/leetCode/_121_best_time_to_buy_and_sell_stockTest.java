package pl.realcode.leetCode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class _121_best_time_to_buy_and_sell_stockTest {

    @ParameterizedTest
    @CsvSource({"7;1;5;3;6;4,5", "7;6;4;3;1,0"})
    void testSolution(String prices, int output) {
        int[] pricesInt = Arrays.stream(prices.split(";")).mapToInt(Integer::parseInt).toArray();
        var solution = new _121_best_time_to_buy_and_sell_stock();
        assertEquals(output, solution.maxProfit(pricesInt));
    }

}