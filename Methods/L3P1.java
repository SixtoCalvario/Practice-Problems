/*
Write a program that prints your name, class and block.  
The main method should call printHeader2.  
That method, in turn should call printName (from Header1.java), printClass and printBlock.  
Each method simply outputs the associated information.  
All methods are public static void and take no parameters.
*/
package Methods;

public class L3P1 {
    
    public static void printClass() {
        System.out.println("Class: Meep City Scamming 101");
    }

    public static void printBlock() {
        System.out.println("Block: All of em :D");
    }

    public static void printHeader2() {
        Header1 name = new Header1();
        name.PrintName();
        printClass();
        printBlock();
    }

    public static void main(String[] args) {
        printHeader2();
    }
}
