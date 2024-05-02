import java.util.Scanner;
public class Quotes {

    public static void main(String[] args) {
        // takes pixar quote
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Pixar quote: ");
        String quote = input.nextLine().toUpperCase();
        input.close();
        System.out.print(wordCount(quote));
    }


    // determines amount of words in quote
    public static String wordCount(String str) {
        
        // splits data into array counts items in array and you get words count
        String[] quoteArray = str.split(" "); 
        int words = quoteArray.length; 
        String wordCount = "There are "+words+" words";
        return wordCount;
    }


    // determines the amount of times a letter occurs
    public static String letterOccurances(String str) {
        
        // splits quote into an array bc its easier for me at least 
        String[] quoteArray = str.split(" ");

        // Array of Alphabet
        String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int[] letterOccurancesArray = new int[alphabet.length];
        
        // for loop checks the amount of letters occured in each index  
        for(int i=0; i<quoteArray.length; i++) {
            String currentWord = quoteArray[i];
            // working with a string of one word
            for(int j=0; j<currentWord.length(); j++ ) {
                    String currentLetter = ""+currentWord.charAt(i);
                    for(int k=0; k<alphabet.length; k++) {
                        if(currentLetter==alphabet[k]) {
                            letterOccurancesArray[i] = ++;
                        }
                    }
                }
            
        }
    
    }
}