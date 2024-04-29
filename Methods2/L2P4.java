/*
 Write a program that takes 4 integers (x1, y1, x2, y2).  
 That information will be sent into several methods that output information about the points.  
 The following methods should be created:
    Format - outputs the points as (x1, y1) & (x2, y2)
    Midpoint - outputs the midpoint of the two points (look the formula up if you don’t know it)
    Distance - outputs the distance between the two points (look the formula up if you don’t know it)
    Slope - outputs the slope between the two points (look the formula up if you don’t know it)

 */
// this isnt even done bro
package Methods2;
import java.util.Scanner;
public class L2P4 {
    
   public static void format(int x1, int y1, int x2, int y2) {
      System.out.println( "("+x1+","+y1+") & "+"("+x2+","+y2+")" );
   }

   public static void midpoint(int x1, int y1, int x2, int y2) {
      System.out.println(((x1+x2)/2)+","+((y1+y2)/2));
   }

   public static void distance(int x1, int y1, int x2, int y2) {
      System.out.println(  Math.pow(x2-x1)    );
   }

   public static void slope(int x1, int y1, int x2, int y2) {
      System.err.println();
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
      
      // asking user which they wnat to do?!?!?
      System.out.println("1 = format");
      System.out.println("2 = midpoint");
      System.out.println("3 = distance");
      System.out.println("4 = slope");
      System.out.print("ENTER OPTION GRRR");
      int num = input.nextInt(); 
      input.close();
      switch (num) {
         case 1:

         break;

         case 2:

         break;

         case 3: 

         break;

         case 4:

         break;

         default:

         break;
      }
   }
}
