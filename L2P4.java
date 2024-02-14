/*
 Write a program that generates two random numbers between 1 and 11 and finds/displays their total.  
 Then, use a while loop to add one new random number between 1 and 11 to the total if the user enters the word “HIT.” 
 Continue this process until the user enters something other than “HIT.” 
 At the end of the program, if the total is above 21, display the word “BUST.” 
 If the total is exactly 21, display the word “WINNER.” Otherwise, display the total score in the form “Score: <total>.”  
 */
import java.util.Scanner;
public class L2P4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // generate 2 random nums
        int num1 = (int)(Math.random()*11+1);
        int num2 = (int)(Math.random()*11+1);
        
        // find and display sum
        int sum = num1+num2;
        System.out.println("The total of the two nums is: "+sum);

        // control variable
        String hit = "HIT";

        // while
        while (hit.equals("HIT")) {
            System.out.print("Enter: ");
            hit = input.nextLine();
            int num3 = (int)(Math.random()*11+1);
            System.out.println("ANOTHER NUM BETWEEN 1-11 HAS BEEN ADDED");
            sum+=num3;
        }

        // if sum is over 21
        if (sum>21) {
            System.out.println("BUST");
        }
        // if sum is 21
        if (sum==21) {
            System.out.println("WINNER");
        }
        // if sum is under 21
        if (sum<21) {
            System.out.println("Score: "+sum);
        }
    }
}
