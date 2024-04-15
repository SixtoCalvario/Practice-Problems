/*
 Write a program that prints your name and id#.  
 The main method should call a method called printHeader. 
 The printHeader method should call two methods, printName(displays your name) and printID (displays your id).  
 All methods are public static void.  
 The printHeader should take the students name and id as parameters and pass them on to the appropriate methods
  to be output.
 
 */
package Methods2;

public class L2P1 {
    public static void printName(String name) {
    }

    public static void printID() {
    }

    public static void printHeader(String name, int ID) {
        printName(name);
        printID(ID);
    }
    public static void main(String[] args) {
     printHeader("myName", 995195);   
    }
}
