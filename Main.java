public class Main{
    public static void main (String[] args){
          System.out.println("F1 Sim started");
          Driver Driver1 = new Driver();
          Driver1.name = "Kirushan";
          Driver1.basePace = 90;
          System.out.println(Driver1.name + " pace: " + Driver1.basePace);
          Driver Driver2 = new Driver();
          Driver2.name = "Lewis";
          Driver2.basePace = 74;
          System.out.println(Driver2.name + " pace: " + Driver2.basePace);
          double timeDifference = Driver1.basePace - Driver2.basePace;
          System.out.println("Difference in base lap time between Kirushan and Lewis: " + timeDifference );
          for (int Lap = 1; Lap <= 10; Lap++){
                      double tyreWear = Math.pow(1.0005,Lap);
          double lapTime = Driver1.basePace*tyreWear;
           System.out.println("Lap time for Lap: " + Lap + " is: " + lapTime);
           for (int Lap = 1; Lap <= 10; Lap++){
                      double tyreWear = Math.pow(1.0005,Lap);
          double lapTime1 = Driver1.basePace*tyreWear;
           System.out.println("Lap time for " + Driver1.name  + "'s "+ Lap + " is: " + lapTime1);
          double lapTime2 = Driver2.basePace*tyreWear;
           System.out.println("Lap time for "  + Driver2.name + "'s "+ Lap + " is: " + lapTime2);
          }
          }
    }
}