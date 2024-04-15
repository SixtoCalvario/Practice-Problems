/*
  Write a program that has a method called printName.  
  The printName method is public static void and takes a String parameter and an int parameter.  
  The main method should call the printName method once.  
  The printName method should use a loop to output the name parameter the number of times of the int parameter. 
 */
package Methods2;

public class L1P2 {

    public static void printName(String name, int num) {
        for(int i=0; i<num; i++) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        printName("April", 20);
    }    
}