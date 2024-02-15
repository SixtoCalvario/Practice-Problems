/* 
Write a program that adds up all of the numbers that a user enters.  
Do not ask the user ahead of time how many numbers they want to enter.  
Instead, have them enter -999 to signal the end of their input.  
Be sure not to include the -999 in the total.  
At the end of the program, output the total of the number.  
Use a while loop.
*/
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
        // scanner
        Scanner input = new Scanner(System.in);
        
        // control variable
        double num = 0;
        double sum = 0;
        double runs = 0;
        // print statement
        System.out.println("Enter test scores and enter a negative num to stop");

        // condition
        while (num>=0) {
            // body
            System.out.print("Enter your num here: ");
            num = input.nextDouble();
            if (num>=0) {
                sum+=num;
            }
            else{
                num = -1;
            }
            runs++;
        }
        if (runs>0) {
           // find avg 
            double avg = sum/runs;

            // print statements 
            System.out.println("your sum is: "+sum);
            System.out.println("your average is: "+avg);
        }
        input.close();
    }
}
