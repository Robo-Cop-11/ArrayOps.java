import java.util.*;

public class ArrayOperations {
    // Function to segregate even and odd numbers into separate arrays
    public void segregateOddEven(int[] array) {
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : array) {
            if (num % 2 == 0) {
                even.add(num);
            } else {
                odd.add(num);
            }
        }

        System.out.println("Odd numbers: " + odd);
        System.out.println("Even numbers: " + even);
    }

    // Function to find the index of the first number in the closest pair
    public int findMinDiffPair(int[] array) {
        if (array.length < 2) {
            return -1; // Invalid case
        }

        int minIndex = 0;
        int minDiff = Math.abs(array[1] - array[0]);

        for (int i = 1; i < array.length - 1; i++) {
            int diff = Math.abs(array[i + 1] - array[i]);
            if (diff < minDiff) {
                minDiff = diff;
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Function to convert an array into an ArrayList
    public ArrayList<Integer> arrayToArrayList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
        }
        return list;
    }
    // Function to convert an ArrayList back into an array
    public int[] arrayListToArray(ArrayList<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

}
