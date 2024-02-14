// Ask a user if they want to continue.  The program should keep running for any input they type except no.  Once the user enters no, exit the program. Use a while loop.
import java.util.Scanner;
public class L1P4 {
    public static void main(String[] args) {
        // scanner
        Scanner input = new Scanner(System.in);

        // variables
        String yes = "";
        boolean compare = yes.equals((yes));

        // while loop 
        while (compare) {
            System.out.print("Do you want to continue?: ");
            yes = input.nextLine();
            if(yes.equals("no")){
                compare = false;
            }
        }
    }  
}