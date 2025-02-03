import java.util.*;

public class UserInput {
    // Function to take an array input from the user
    public int[] arrayInput() {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter 5 Numbers: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        return array;
    }
}
