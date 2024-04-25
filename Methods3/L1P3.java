package Methods3;
import java.util.Scanner;

/*
Write a method called formatID that takes an int parameter.  
The main method should ask the user for their id.  
That id should be sent into the formatID method.  
The formatID method will add “ID:” in front of the number and return it to the main (as a String) to be output.
 */
public class L1P3 {
    public static String formatID(int nums) {
        String formattedId = "ID: "+(nums+"");
        return formattedId;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your id bro: ");
        int userID = input.nextInt();
        input.close();
        System.out.println(formatID(userID));
    }
}