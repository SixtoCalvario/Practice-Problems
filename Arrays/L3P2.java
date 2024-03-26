/* Users can enter names and phone numbers, and determine the size of the arrays. 
 Names are stored in one array and the numbers in another. 
 Allow users to enter all of their information, then search for a name. 
 When the name is found, show the name and number on the screen. 
 If the name is not in the list, display an appropriate message. */
package Arrays;
import java.util.Scanner;
public class L3P2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // taking user input to determine size of arrays        
        System.out.print("How many names do you want to enter? ");
        int nameArraySize = input.nextInt();
        System.out.print("How many phone numbers do you want to enter? ");
        int phoneArraySize = input.nextInt(); 

        // NAMES ARRAY NAMES ARRAY NAMES ARRAY NAMES ARRAY NAMES ARRAY NAMES ARRAY NAMES ARRAY NAMES ARRAY 
        String[] namesArray = new String[nameArraySize]; 
        // PHONE NUMBER ARRAY PHONE NUMBER ARRAY PHONE NUMBER ARRAY PHONE NUMBER ARRAY PHONE NUMBER ARRAY 
        int[] phoneArray= new int[phoneArraySize]; 

        // input for phone numbers 
        System.out.println("Enter phone numbers, enter -1 when done or have entered all the numbers. Don't include -");
        for(int i = 0; i<phoneArray.length; i++) {
            System.out.print("Enter a phone number: ");
            phoneArray[i] = input.nextInt();
            if(phoneArray[i]==-1) {
                i=phoneArray.length;
            }
        }
         
        // eats \n because scanner bug :(
            input.nextLine(); 
        // input for names 
        System.out.println("Enter the names for then nums, enter -1 when done or have entered all the names.");
        for(int i=0; i<namesArray.length; i++) {
            if(phoneArray[i]!=0){
                System.out.print("Enter name for this phone number - "+phoneArray[i]+": ");
                namesArray[i] = input.nextLine();
            }
        }

        // asks user for name and looks for it with the number 
        System.out.print("Which name do you want to look for? ");
        String name = input.nextLine();
        // for loop to find name 
        boolean found = false;
        for(int i = 0; i<namesArray.length; i++) {
             if(name.equals(namesArray[i])) {
                System.out.println(namesArray[i]+" - "+phoneArray[i]);
                found = true;
             }
        }
        if(found==false) {
            System.out.println("That name was not found D:");
        }
        input.close();
    }
}
