// Write a program that asks a user to enter 9 numbers.  Find and display the total of those numbers.  Use a while loop.
import java.util.Scanner;
public class L1P3 {
    public static void main(String[] args) {
        // make scanner object
        Scanner input = new Scanner(System.in);

        // take 9 inputs and display sum
        int inputs = 0;
        int sum = 0;
        while(inputs!=9) {
            System.out.print("Enter 9 numbers: ");
            int answer = input.nextInt();
            sum += answer;
            inputs++;
        }
        input.close();
        System.out.print("Your sum is: "+sum);
    }
}