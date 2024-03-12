/*
The Java String class has a method called split that takes a string parameter. 
This parameter is called a delimiter and is used to separate items of data. 
So, if a user enters a set of numbers in one line, separated by commas: 
1,3,5,2,4,6 and that data is stored in the string, input, the information can be separated into an array as follows:
String[ ] arr = input.split(“,”);. Using this idea, take a list of integers from a user (of any length)
separated by commas, store them in a String array, convert that array to an int array, 
and then find the average of the numbers.

*/
package Arrays;
import java.util.Scanner;
public class L2P5 {
    public static void main(String[] args) {
        // creation of Scanner 
        Scanner input = new Scanner(System.in);

        // taking list of nums as a str array and seperating commas 
        System.out.print("Enter a list of numbers seperated by commas: ");
        String inputStr = input.nextLine();
        String[] str = inputStr.split(",");
        input.close();
        // convert str array to int array
        double runs = 0;
        int sum = 0;
        int[] intArray = new int[str.length];
        for(int i=0; i<str.length; i++) {
            intArray[i] = Integer.parseInt(str[i]);
            runs++;
            sum+=intArray[i];
        }
        // finding average 
        double average = sum/runs;
        System.out.println("The average for the nums you entered is: "+average);
    }
}