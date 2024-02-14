// Write a program that asks the user to enter a string that is longer than 5 characters.  Keep them in the loop as long as their string is 5 or more characters.  Use a while loop. 
import java.util.Scanner; 
public class L1P5 {
    public static void main(String[] args) {
        // scanner 
        Scanner input = new Scanner(System.in);

        // variables
        String str = "12345";
        int strInt = str.length();

        // loopy
        while(strInt>=5) {
            System.out.print("Enter a string that is longer than 5 characthers: ");
            str = input.nextLine();
            strInt = str.length();
        }

        // esacpe of the loop :(
        System.out.println("HOW DARE YOU ESCAPE");
    }
}