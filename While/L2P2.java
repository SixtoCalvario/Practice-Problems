/*  
asks the user to enter a number 1-10. y
Choose a random number between 1-10. y
Let them know if they guessed the number or not.  y
while & give them a maximum of three guesses. y
At the end, be sure to output the random number for them to see. 
Also, let them know after each guess if the target number is higher or lower than their guess.  
*/
import java.util.Scanner;
public class L2P2 {
    public static void main(String[] args) {
        // Scanner 
        Scanner input = new Scanner(System.in);

        // control variable
        int tries = 0;

        // generating a random num

        int randomNum = (int)(Math.random()*10+1);

        // while 
        while(tries<3) {
            // input to take num
            System.out.print("Enter a number between 1-10: ");
            int guess = input.nextInt();

            //check if guess is randomNum
            if (guess==randomNum) {
                System.out.println("You got it right!");
            }
            if (guess!=randomNum) {
                System.out.println("You got it wrong :(");
                if (guess<randomNum) {
                    System.out.println("Your guess is lower than the random number");
                }
                if (guess>randomNum) {
                    System.out.println("Your guess is higher than the random number");
                }
            }

            // control variable update
            tries++;
        }
        input.close();
        System.out.println("The random number is: "+randomNum);
    }
}
