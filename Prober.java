import java.util.Scanner;
/**
 * Write a description of class Prober here.
 *
 * @author (Felix)
 * @version (Pre-Alpha v1.0)
 */
public class Prober
{
    public Prober()
    {
        // initialise instance variables
        Scanner inputStream = new Scanner (System.in);
        String playerInput;
        String compResponse = ""; //The '= "";' is to fix an error in the program
        int round = 1;
        int playerScore = 0;
        int compScore = 0;
        boolean finish = false;
        while (!finish){
            System.out.println("--------------------");
            System.out.println("Cooperate or defect?");
            playerInput=inputStream.nextLine();
            switch (playerInput) {
                //the prints are just to check the t4t status
                case "c" : System.out.println("You cooperated");
                            if(compResponse.equals("c")){playerScore += 1; compScore += 1;}
                            //This^ line is for if both the player and computer cooperate
                            else if(compResponse.equals("d")){playerScore -= 5; compScore += 2;}
                            //This^ line of is for if the player cooperates and the comp defects
                            break;
                case "d" : System.out.println("You defected");
                            if(compResponse.equals("c")){playerScore += 2; compScore -= 5;}
                            //This^ line is for if the comp cooperates and the player defects
                            else if(compResponse.equals("d")){playerScore -= 3; compScore -= 3;}
                            //This^ line is for if both the player and computer defect
                            break;
                case "f" : System.out.println("Game Over");
                           finish = true;
                            break;
                default : System.out.println("Invalid input");
                            break;
                 }
            compResponse = "d";
            round += 1;
            System.out.println("The player score is "+ playerScore);
            System.out.println("The comp score is "+ compScore);
            }
    }
}