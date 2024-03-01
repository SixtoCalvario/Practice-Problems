    /*
     Write a program that uses an array of strings. 
     The user should input 5 names
     after all input is finished, see the five names output.
     */
package Arrays;
import java.util.Scanner;
public class L1P2 {
    public static void main(String[] args) {   
    // creation of scanner
    Scanner input = new Scanner(System.in);
    
    // creation of array
    String [] strArray = new String[4];

    for(int i = 0; i<5; i++) {
    // user input 
    System.out.print("Enter a string: ");
        String str = input.nextLine();
        strArray[i] = str;
    }
    input.close();
    int x = 0;
    while(x<5) {
        System.out.println(strArray[x]);
        x++;
    }
    }
}