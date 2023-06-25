package pl.realcode.leetCode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class _2739_Total_disance_traveledTest {

    @ParameterizedTest
    @CsvSource({"5,10,60", "1,2,10", "9,2,110", "4,1,40", "9,3,110"})
    void testSolution(int mainTank, int additionalTank, int distance) {
        var solution = new _2739_Total_disance_traveled();
        assertEquals(distance, solution.distanceTraveled(mainTank, additionalTank));
    }

}