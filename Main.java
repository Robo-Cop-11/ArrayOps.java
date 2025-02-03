// Name: Manan Khanna 
// PRN: 23070126156
// Batch: AIML B3 
// Program to demonstrate array operations

import java.util.*;

public class Main {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        ArrayOperations arrayOps = new ArrayOperations();

        // Accept user input
        int[] inputArray = userInput.arrayInput();

        // Segregate numbers into even and odd arrays
        arrayOps.segregateOddEven(inputArray);

        // Find the index of the first number in the closest pair
        int minDiffIndex = arrayOps.findMinDiffPair(inputArray);
        System.out.println("Index of first number in the closest pair: " + minDiffIndex);

        // Convert array to ArrayList and back
        ArrayList<Integer> arrayList = arrayOps.arrayToArrayList(inputArray);
        System.out.println("Converted to ArrayList: " + arrayList);

        int[] convertedArray = arrayOps.arrayListToArray(arrayList);
        System.out.println("Converted back to Array: " + Arrays.toString(convertedArray));
    }
}
