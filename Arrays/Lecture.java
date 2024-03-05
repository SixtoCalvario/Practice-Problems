import java.util.Arrays;
public class Lecture {
    public static void main(String[] args) {
        // pritning arrays
            int[] nums = {1, 2, 3};
            // this leads to the system memory being printed for where it is stored
            System.out.println(nums);   
            // prints out array without memory address 
            System.out.println(Arrays.toString(nums));
        // changing references 
            nums = new int[4];
        // when you do this you tell the variable hey look at that new car and so it changes the direction of its view 
        
        // iteration with arrays 
            for( int i=0; i<nums.length; i++) {
                nums[i]+=10;
            }
    }
}