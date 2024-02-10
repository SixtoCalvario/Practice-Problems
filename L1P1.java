// Write a program that asks the user to enter a number between 10 and 20.  Then, print “Java” on the screen that many times.  Use a while loop. 
import java.util.Scanner;
public class L1P1{
    public static void main(String[] args){
        // making scanner for input
        Scanner Input = new Scanner(System.in);
        // taking a int input from user
        System.out.print("Enter a num between 10-20: ");
        int num = Input.nextInt();
        int prints = 0;

        // if statement to check if num is between 10-20
        if (10<=num&& num<=20) {
            while (num!=prints) {
                System.out.println("Java");
                prints+=1;
            }
        }
        else
            System.out.println("Your number isn't between 10-20");
    }
}