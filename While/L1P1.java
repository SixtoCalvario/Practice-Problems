//Write a program that asks the user to enter a number between 10 and 20.  Then, print “Java” on the screen that many times.  Use a while loop. 
import java.util.Scanner;
public class L1P1 {
    public static void main(String[] args) {
        // SCANNER
        Scanner input = new Scanner(System.in);
        // taking input
        System.out.print("Enter a num between 10-20: ");
        int num = input.nextInt();
        input.close();
        // control var
        int runs = 0;
        while (runs!=num) {
            System.out.println("JAVA");
            runs++;
        }
    }
}
