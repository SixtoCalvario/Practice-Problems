package Arrays;

public class Tutorial11 {
    public static void main(String[] args) {
        
        // Create an array of size 5 to store intefers
        
        // steps 3-6
        int [] arr = new int[5];
        // System.out.println(arr);
        arr[0] = 12;
        arr[1] = 17;
        arr[2] = 14;
        arr[3] = 26;
        arr[4] = 12;
        System.out.println(arr[1]);

        // step 7-9
        int total = 0;
        for(int x=0; x<arr.length; x++){
            total+=arr[x];
        }
        System.out.println("TOTA: "+total);
    }
}
