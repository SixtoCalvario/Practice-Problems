/*
Write a program that prints your name and id#.  
The main method should call a method called printHeader. 
The printHeader method should call two methods, printName(displays your name) 
and printID (displays your id).  
All methods are public static void and take no parameters.
*/
package Methods;

public class L2P1 {

    public static void printName() {
        System.out.println("Name: Sixto");
    }

    public static void printID() {
        System.out.println("ID: 995195");
    }

    public static void printHeader() {
        printName();
        printID();
    }
    
    public static void main(String[] args) {
        printHeader();
    }    
}
