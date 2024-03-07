package Arrays;
/*
 Create an empty array of ints. 
 Use a loop to ask the user to enter numbers into the array. 
 Input should continue until the user enters 20 numbers or a value of -1. 
 When finished, output the number of non-negative values that they entered to the console.
 */
import java.util.Scanner;
public class L1P5 {
    public static void main(String[] args) {
        // create scanner
        Scanner input = new Scanner(System.in);
        
        // create array
        int[] array = new int[20];

        // for loop to take 20 nums max
        for(int i = 0; i<20; i++) {
            // user input 
            System.out.print("Enter your num: ");
            int num = input.nextInt();
            if(num==-1){
                i=21;
            }
            else{
                array[i] = num;
            }
        }
        input.close();
        int positiveNums = 0;
        for(int i = 0; i<array.length; i++) {
            if( (array[i]/-1)<0 ){
                positiveNums++;
                System.out.println(array[i]+ " is a positive number.");
            }
        }
        System.out.println("You inputed "+positiveNums+" non-negative numbers");
    }
}
