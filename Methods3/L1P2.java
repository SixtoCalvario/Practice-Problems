package Methods3;
/*
Write a method called getName that takes no parameters, 
but returns your name to the main method where it is stored and printed 4 times.
*/
public class L1P2 {

    public static String getName() {
        String name = "Sixto";
        return name;
    }
    public static void main(String[] args) {
        String minnie = getName();
        System.out.println(minnie);
    }
}
