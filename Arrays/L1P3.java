package Arrays;
import java.util.Scanner;
public class L1P3 {
    public static void main(String[] args) {
        /*
         Write a program that uses an array of doubles. The user should input 6 test scores and then, after all input is finished, see the six scores output.

         */
        Scanner input = new Scanner(System.in);
        double[] score = new double[6];
        for(int i=0; i<6; i++) {
            System.out.print("Enter a test score: ");
            score[i] = input.nextDouble();
        }
        input.close();
        for(int i=0; i<6; i++) {
            System.out.println("Test score: "+score[i]);
        }
    }    
}
