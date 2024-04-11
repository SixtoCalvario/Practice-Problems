/*
Write a program that has a method called arithmetic.  
The arithmetic method should take no parameters.  
The method should ask a user for two numbers and then output the result of all 
five math operations (+, -, *, /, %) using the two numbers.
*/
package Methods;
import java.util.Scanner;
public class L1P3 {
    public static void arithmetic() {
        Scanner input = new Scanner(System.in);

        // first num input 
        System.out.print("Enter your first num: ");
        double a = input.nextDouble();

        // second num input 
        System.out.print("Enter your second num: ");
        double b = input.nextDouble();
        input.close();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
    public static void main(String[] args) {
        arithmetic();
    }
}
