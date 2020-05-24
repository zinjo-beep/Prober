import java.util.Scanner;
/**
 * Write a description of class Prober here.
 *
 * @author (Felix)
 * @version (Pre-Alpha)
 */
public class Prober
{
    private int i;
    public Prober()
    {
        // initialise instance variables
        Scanner inputStream = new Scanner (System.in);
        String playerInput;
        String compResponse;
        int round = 1;
        boolean finish = false;
        while (!finish){
            System.out.println("--------------------");
            System.out.println("Cooperate or defect?");
            playerInput=inputStream.nextLine();
            switch (playerInput) {
                //the prints are just to check the t4t status
                case "c" : System.out.println("You cooperated");
                            break;
                case "d" : System.out.println("You defected");
                            break;
                default : System.out.println("Invalid input");
                            break;
                 } 
            compResponse = "d";
            round += 1;
            }
    }
}
