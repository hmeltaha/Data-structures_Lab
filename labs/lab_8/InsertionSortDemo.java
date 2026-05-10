import java.util.Random;
import java.util.Arrays;

public class InsertionSortDemo {

    // Method to perform Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            // Print array after each pass
            System.out.println("Pass " + i + ": " + Arrays.toString(arr));
        }
    }

    // Method to generate random array
    public static int[] generateArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100); // numbers from 0 to 99
        }

        return arr;
    }

    public static void testArray(int size) {
        int[] arr = generateArray(size);

        System.out.println("\n==========================");
        System.out.println("Array Size: " + size);

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        // Test arrays of size 5, 10, and 20
        testArray(5);
        testArray(10);
        testArray(20);
    }
}
