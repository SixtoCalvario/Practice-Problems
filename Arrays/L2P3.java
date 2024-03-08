/*
 Create a character array of size 35. 
 Allow the user to enter letters into the array as long as the letters are uppercase and 
 they dont exceed the available storage space of the array. 
 As soon as they enter a lowercase letter, the loop should terminate and 
 the program should output the physical and logical sizes of the array.
 
 */
package Arrays;
import java.util.Scanner;
public class L2P3 {
    public static void main(String[] args) {
        // SCANNER OH MY LAWRD SCANNER 
        Scanner input = new Scanner(System.in);
        // char array ' ___ '
        char[] charArray = new char[35];

        // logical size variable 
        int logicalSize = 0;
        // for loop to enter 35 values: 
        for(int i=0; i<35; i++) {
            System.out.println("Enter your char: ");
            char charInput = input.next().charAt(0);
            
            // checking for upper case value
            if(65<=charInput&&<=90) {
                charArray[i] = charInput;
                logialSize++;
            } 
            // if its not upper case then its lowercase...
            else{
                i=35;
            }
            input.close();
            // phtsical size
            System.out.println("The physical size is: "+charArray.length);
            // logical size
            System.out.println("The logical size is: "+logialSize);
        }
    }
}
