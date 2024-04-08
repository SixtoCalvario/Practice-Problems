/*
Write a program that has a method called printName.  
The printName method is public static void and takes no parameters.  
The main method should call the printName method once.  
The printName method should use a loop to output your name four times.
*/
package Methods;

public class L1P2 {
    public static void printName() {
        for(int i = 0; i<4; i++) {
            System.out.println("sick toe");
        }
    }
    public static void main(String[] args) {
        printName();
    }
}
