/* 
Write a program that adds up all of the numbers that a user enters.  
Do not ask the user ahead of time how many numbers they want to enter.  
Instead, have them enter -999 to signal the end of their input.  
Be sure not to include the -999 in the total.  
At the end of the program, output the total of the number.  
Use a while loop.
*/
import java.util.Scanner;
public class L2P3 {
    public static void main(String[] args) {
        // scanner
        Scanner input = new Scanner(System.in);
        
        // control variable
        int num = 0;
        int sum = 0;
        // print statement
        System.out.println("Enter numbers to find the sum when you are done enter -999");

        // condition
        while (num!=-999) {
            // body
            System.out.print("Enter your num here: ");
            num = input.nextInt();
            if (num!=-999) {
                sum+=num;
            }
        }
        System.out.println("your sum is: "+sum);
        input.close();
    }
}
