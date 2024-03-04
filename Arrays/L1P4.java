/*
Create an array of ints. Fill the array with 10 random values between 1 and 100. 
Then, show the values in the array, on the same line, separated by commas.
*/
package Arrays;
public class L1P4 {
    public static void main(String[] args) {
        int[] random = new int[10];
        for(int i=0; i<10; i++){
            random[i] = (int)(Math.random()*100+1);
            System.out.print(random[i]+", ");
        }
    }
}
