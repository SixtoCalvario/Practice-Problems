package Arrays;

public class L1P1 {
    public static void main(String[] args) {
        /* 
        Create an array of strings of your classes. 
        Assign each class to a space in the array individually after the creation of the array (e.g. courses[0] = “CS1”). 
        Then, use a loop to show all of the elements of the array.
        */
        String[] classes = {"History", "English", "Math", "GD", "CS2", "Gym", "Chem", "Health"};
        for(int i=0; i<classes.length; i++) {
            System.out.println(classes[i]);
        }
    }
}
