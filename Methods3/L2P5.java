package Methods3;
/*
Write a program that creates an array of ints.  
Send the array into a method called average that calculates and returns 
the average of the numbers to the main for display.  
 */
public class L2P5 {
    
    public static double average(int[] nums) {
        int sum = 0;
        int runs = 0;
        for (int i : nums) {
            sum+=i;
            runs++;
        }
        double sumDouble = (double)sum;
        double runsDouble = (double)runs;
        double avg = sumDouble/runsDouble;
        return avg;
    }

    public static void main(String[] args) {
        
        int[] arrayOfInts = new int[10];
        for(int i=0; i<arrayOfInts.length; i++) {
            int[i] = (int)(Math.random()*10+1);
        }
        double avg = average(arrayOfInts[]);
    }
}
