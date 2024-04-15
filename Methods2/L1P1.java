/*
  Write a program that has a method called output.  
  The output method is public static void and takes a single String parameter.  
  The main method should call the output method three times.  
  Each time, a different word should be sent in to be output.  
  The output method should take the parameter string and use System.out.println to display it.
 */

package Methods2;

/**
 * L1P1
 */
public class L1P1 {
   
   public static void output(String leWords) {
    System.out.println(leWords);
   }
   
    public static void main(String[] args) {
        output("le fishie");
        output("au");
        output("Chocolate");
    }
}