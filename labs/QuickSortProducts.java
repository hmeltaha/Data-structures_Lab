import java.util.Arrays;

public class QuickSortComparison {

    // Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            System.out.println("After partition: " + Arrays.toString(arr));

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // Merge Sort
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    public static void main(String[] args) {

        // Task 2: Product Prices
        int[] prices = {120, 45, 300, 75, 20, 150, 90};

        System.out.println("Original Prices:");
        System.out.println(Arrays.toString(prices));

        int[] quickArray = prices.clone();
        int[] mergeArray = prices.clone();

        // Quick Sort Timing
        long quickStart = System.nanoTime();
        quickSort(quickArray, 0, quickArray.length - 1);
        long quickEnd = System.nanoTime();

        System.out.println("\nQuick Sort Result:");
        System.out.println(Arrays.toString(quickArray));

        // Merge Sort Timing
        long mergeStart = System.nanoTime();
        mergeSort(mergeArray, 0, mergeArray.length - 1);
        long mergeEnd = System.nanoTime();

        System.out.println("\nMerge Sort Result:");
        System.out.println(Arrays.toString(mergeArray));

        // Task 3: Performance Comparison
        System.out.println("\nExecution Time Comparison");
        System.out.println("Quick Sort: " + (quickEnd - quickStart) + " ns");
        System.out.println("Merge Sort: " + (mergeEnd - mergeStart) + " ns");
    }
}