/*
 Write a method called getID that takes no parameters, but returns your id to the main method where it is stored and printed. 
 */
package Methods3;

public class L1P1 {
    public static int getID() {
        int id = 995195;
        return id;
    }
    public static void main(String[] args) {
        int id = getID();
        System.out.println(id);
    }
}
