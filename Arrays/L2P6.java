/*
 Create a program that fills an array with fifteen random numbers between 1 and 100. 
 Use a loop to search the list for the smallest number. 
 Display the list, the smallest number and its location.
 */
// test question 
package Arrays;
public class L2P6 {
    public static void main(String[] args) {
        int[] intArray = new int[15];
        // assigning 15 index's a random num :D and finding the smallest 
        int smallest = 100;
        for(int i=0; i<intArray.length; i++) {
            intArray[i] = (int)(Math.random()*100+1);
            System.out.println(intArray[i]);
            if(smallest>intArray[i]) {
                smallest = intArray[i];
            }
        }
        System.out.println("The smallest number is: "+smallest);
    }
}