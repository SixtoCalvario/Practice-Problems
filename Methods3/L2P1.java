package Methods3;

import java.util.Scanner;

public class L2P1 {
    /*
     * Write a program that takes a user's birth month, year and day.
     * Send that information into a method called formatBday that returns the
     * information as a String in the form 9/17/1992.
     * The output should be written in the main.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        // birth month
        System.out.print("Enter your birth month: ");
        int month = input.nextInt();
        
        // birth year
        System.out.print("Enter your birth year: ");
        int year = input.nextInt();

        // birth day
        System.out.print("Enter your birth day: ");
        int day = input.nextInt();
        
        System.out.println(formatBday(month, year, day));
        input.close();
    }

    public static String formatBday(int month, int year, int day) {
        String birthday = (month+"")+"/"+(day+"")+"/"+(year+"");
        return birthday;
    }
}
