/*
Write a program that has five methods.  
One each for addition, subtraction, division, multiplication and modulus.  
Ask the user which operation they would like to see and then show them the results 
of that operation.  
Use the same two numbers for each of the operations.

*/
package Methods;
import java.util.Scanner;
public class L2P2 {

    public static void addition() {
        System.out.println(100+20);
    }

    public static void subtraction() {
        System.out.println(100-20);
    }

    public static void division() {
        System.out.println(100/20);
    }

    public static void multiplication() {
        System.out.println(100*20);
    }
    
    public static void modulus() {
        System.out.println(100%20);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Which opperation do you want to use: ");
        String response = input.nextLine();
        input.close();
        if(response.equals("addition")) {
            addition();
        }

        if(response.equals("subtraction")) {
            subtraction();
        }
        
        if(response.equals("division")) {
            division();
        }

        if(response.equals("multiplication")) {
            multiplication();
        }

        if(response.equals("modulus")) {
            modulus();
        }
        else{
            System.out.println("Not valid :(");
        }
    }
}