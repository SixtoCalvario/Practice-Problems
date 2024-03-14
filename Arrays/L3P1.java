/*
    Create a program that fills an array with twenty random numbers between 1 and 30. 
    Ask the user for a number that they want to search for. 
    If the number is found, output its index. 
    If the number is not found, output -1. 
    Also, print the list so that the user can verify your results. 
*/
package Arrays;
import java.util.Scanner; 
public class L3P1 {
    public static void main(String[] args) {
        // scanner :D
        Scanner input = new Scanner(System.in);
        int[] intArray = new int[20];

        // for loop to assign 20 random nums to the array 
        for(int i=0; i<20; i++) {
            intArray[i] = (int)(Math.random()*30+1);
        }

        // taking user input
        System.out.print("What number do you want to search for? : ");
        int userInt = input.nextInt();
        input.close();
        
        // finding num if not it outputs -1
        boolean intFound = false;
        for(int i = 0; i<intArray.length; i++) {
            if(userInt==intArray[i]) {
                System.out.println("Your num is at the following index(es): "+i);
                intFound = true;
            }
        }
        if(intFound!=true) {
            System.out.println("-1");
        }
        for(int i=0; i<intArray.length; i++) {
            System.out.println("The number of index "+i+" is "+intArray[i]);
        }
    }
}
