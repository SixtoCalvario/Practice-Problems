/*
 Create an array of size 26 that stores the alphabet (in order). 
 Then, create a separate array that stores the alphabet in a random order. 
 At the top of the program, ask the user to enter a string. 
 Then ask if they want to encrypt or decrypt that string. 
 If they choose to encrypt, find the location of each letter in the original array
 and output (in its place) the letter at the same position in the unordered array. 
  Decrypting would involve working in the opposite direction.
 */
package Arrays;
import java.util.Scanner;
public class L3P3 {
<<<<<<< HEAD
    Scanner input = new Scanner(System.in);
    String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","Q","X","Y","Z"};
    String[] randomAlphabet = new String[26];
    // randomized alphabet
    int shiftAmount = (int)(Math.random()*24);
    for(int i=0; i<randomAlphabet.length; i++) {
       randomAlphabet[i] = 
=======
    public static void main(String[] args) {
        // scanner 
        Scanner input = new Scanner(System.in);
        
        // normal alphabet
        // emppty random a-z array
        String[] randomAlphabet = new String[26];

        // random num to shift that many times 
        int key = (int)(Math.random()*20+1);
        int currentLetter = 65;
        // randomized alphabet
        for(int i=0; i<randomAlphabet.length; i++) {
            // shifting the letter 
            boolean check = (key+65)>90;
            if(check) {
                randomAlphabet[i] = ""+((char)(currentLetter+key-26));
            }
            else{
                randomAlphabet[i] = ""+((char)(currentLetter+key));
            }
            currentLetter++;
        }

        // taking string input 
        System.out.print("Enter a str: ");
        String str1 = input.nextLine();
        char[] char1Array = new char[str1.length()];
        // asking if they want to encrypt
        System.out.print("E = encr | D = decr ");
        String str2 = input.nextLine();
        input.close();

        if(str2.equals("E")){
            // encrypt string 
            for(int i=0; i<str1.length(); i++) {
                boolean check = (key+65)>90;
                if(check) {
                    char1Array[i] = (char)((int)(str1.charAt(i)+key-26));
                }
                else{
                    char1Array[i] = ((char)(currentLetter+key));
                }  
                System.out.print(char1Array[i]);
            }
        }

        // decr string
        else{
            for(int i=0; i<str1.length(); i++) {
                boolean check = (key+65)>90;
                if(check) {
                    char1Array[i] = (char)((int)(str1.charAt(i)-key-26));
                }
                else{
                    char1Array[i] = ((char)(currentLetter-key));
                }  
                System.out.print(char1Array[i]);
            }
        }
>>>>>>> 3e3fdbb (yes)
    }
}