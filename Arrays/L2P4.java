/*
Create a program that asks the user how many names they want to enter, 
creates an array of that size, and then takes the names from the user. 
Finally, output the list after all information has been entered. 
Use a for each loop to print the names out.
*/
package Arrays;
import java.util.Scanner; 
public class L2P4 {
    public static void main(String[] args) {
        // creation of scanner pookie bear 
        Scanner input = new Scanner(System.in);
        // user input 
        System.out.print("How many names do you want to enter? ");
        int numOfNames = input.nextInt();
        String[] names = new String[numOfNames];
    }
}