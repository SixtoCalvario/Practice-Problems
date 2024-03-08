/*
Create an integer array of size 50. 
Allow the user to enter numbers into the array as long as the 
numbers are positive and they don’t exceed the available storage space of the array. 
As soon as they enter a negative number, the loop should terminate and the program should output 
the physical and logical sizes of the array.
*/
package Arrays;
import java.util.Scanner;
public class L2P2 {
    public static void main(String[] args) {
        // creation of scanner for user \_( ' - ')_/
        Scanner input = new Scanner(System.in);
        
        // ARRAY ARRAY OF SIZE 50 OMG ITR AN ARRAY I LOVE ARRAYS ARRAYS ARE MY LIFE I HEART ARRAY
        int[] intArray = new int[50];
        int logicalSize = 0;
        // for loop that stores nums into array :D
        for(int i=0; i<50; i++) {
            System.out.print("Enter your num into the array: ");
            int userInt = input.nextInt(); 
            if (userInt>=0) {
                intArray[i] = userInt;
                logicalSize++;
            }
            else {
                i = 50;
            }
        }
        input.close();
        // logical size

        System.out.println("The arrays' logical size is: "+logicalSize);
        // physical size
        System.out.println("The arrays' physical size is: "+intArray.length);
    }
}