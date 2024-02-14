// Write a program that asks a user how many numbers they want to enter.  Have them enter those numbers and then calculate and display the average of those numbers.  Use a while loop.
import java.util.Scanner;
public class L2P1 {
    public static void main(String[] args) {
        // scanner
        Scanner input = new Scanner(System.in);

        // input 
        System.out.print("how many numbers do you wnat to enter: ");
        int num = input.nextInt();
        int runs = 0;
        int sum = 0;
        while(num!=runs) {
            System.out.print("Enter your num: ");
            sum += input.nextInt();
            runs++;
        }
        System.out.println("Your sum is: "+sum);
    }
}
