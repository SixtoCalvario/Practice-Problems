// Write a program that acts as a countdown from 20 to 10.  Use a while loop.
public class L1P2 {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;
        while (num1>=num2) {
            System.out.println(num1);
            num1-=1;
        }
    }
}
