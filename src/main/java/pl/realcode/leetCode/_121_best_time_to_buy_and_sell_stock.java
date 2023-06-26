package pl.realcode.leetCode;

import java.util.Arrays;

public class _121_best_time_to_buy_and_sell_stock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int lowestPrice = prices[0];

        for (int price:
                prices) {
            int currentProfit = price - lowestPrice;
            if (currentProfit > profit) {
                profit = currentProfit;
                continue;
            }
            if (price < lowestPrice) {
                lowestPrice = price;
            }
        }

        return profit;
    }


}
