/*
 Write a program that assigns values to two integer variables. 
 Call methods add, multiply, subtract, divide and modulus, each taking two integers as parameters.  
 Each method should perform the appropriate operation and display the result.
 */
package Methods2;

public class L2P2 {

    public static void add(int X, int Y) {
        System.out.println(X+Y);
    }

    public static void multiply(int x, int y) {
        System.out.println(x*y);
    }

    public static void subtract(int x, int y) {
        System.out.println(x-y);
    }

    public static void divide(int x, int y) {
        System.out.println(x/y);
    }

    public static void modulus(int x, int y) {
        System.out.println(x%y);
    }
    public static void main(String[] args) {
        int num1 = 10; 
        int num2 = 20;
        add(num1, num2);
        multiply(num1, num2);
        divide(num1, num2);
        subtract(num1, num2);
        modulus(num1, num2);
    }

    
}
