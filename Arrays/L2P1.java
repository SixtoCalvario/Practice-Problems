/* 
Write a program that stores the scores of 10 tests for a student. 
The starting scores should be 80, 76, 98, 65, 79, 82, 85, 90, 99, 85. 
Then, use a for each loop to cycle through the list and output the average of the scores.
*/
package Arrays;
public class L2P1 {
    public static void main(String[] args) {
        double sum = 0;
        double runs = 0;
        double[] scores = {80, 76, 98, 65, 79, 82, 85, 90, 99, 85};
        for(int i=0; i<scores.length; i++) {
            sum += scores[i];
            runs++;
        }
        double average = sum/runs;
        System.out.println("The average score was: "+average);
    }
}