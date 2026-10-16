public class Engine {
    public static void main(String[] args) {
        double baseLapTimeSeconds = 90.0;
        double fuelBurnPerLap = 0.035;
        double softDegradationFactor = 0.095;
        double hardDegradationFactor = 0.025;
        double pitStopLossSeconds = 22.0;

        System.out.println("=== F1 ALGORITHMIC STRATEGY ENGINE ONLINE ===");

        int optimalPitLap = 1;
        double absoluteBestTotalTime = Double.MAX_VALUE;

        for (int testPitLap = 1; testPitLap < 30; testPitLap++) {
            double simulatedTotalTime = 0.0;

            for (int lap = 1; lap <= 30; lap++) {
                if (lap < testPitLap) {
                    simulatedTotalTime += baseLapTimeSeconds + (softDegradationFactor * Math.pow(lap, 1.3)) - (fuelBurnPerLap * lap);
                } else if (lap == testPitLap) {
                    simulatedTotalTime += (baseLapTimeSeconds + 1.5) + pitStopLossSeconds;
                } else {
                    int hardTireAge = lap - testPitLap;
                    simulatedTotalTime += (baseLapTimeSeconds + 1.5) + (hardDegradationFactor * Math.pow(hardTireAge, 1.3)) - (fuelBurnPerLap * lap);
                }
            }

            if (simulatedTotalTime < absoluteBestTotalTime) {
                absoluteBestTotalTime = simulatedTotalTime;
                optimalPitLap = testPitLap;
            }
        }

        System.out.println("=== SYSTEM CONVERGENCE RESULT ===");
        System.out.printf("OPTIMAL STRATEGY: Start on SOFTS -> Pit on Lap %d for HARDS.%n", optimalPitLap);
        System.out.printf("MINIMIZED RACE RUNTIME TIME: %.3f seconds.%n", absoluteBestTotalTime);
    }
}
