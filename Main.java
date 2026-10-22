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
          System.out.println("Difference in time between Kirushan and Lewis: " + timeDifference );
    }
}