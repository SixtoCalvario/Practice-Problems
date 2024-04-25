/*
 Write two functions, both called add.  
 The first add method should take two int parameters and display the result.  
 The second add method should take four int parameters and display the result.  
 Call both from the main.
 
 */
package Methods2;

public class L2P3 {

    public static void add(int x, int y) {
        System.out.println(x+y);
    }

    public static void add(int x, int y, int z, int a) {
        System.out.println(x+y+z+a);
    }


    public static void main(String[] args) {
        add(1,20);
        add(1,19,4,900);
    }
}
