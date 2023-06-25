package pl.realcode.leetCode;

public class _2739_Total_disance_traveled {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int liters = 0;
        while (mainTank > 4) {
            liters += 5;
            mainTank -= 5;
            if (additionalTank > 0) {
                mainTank++;
                additionalTank--;
            }
        }
        liters += mainTank;

        return liters * 10;
    }


}
