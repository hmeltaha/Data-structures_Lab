import java.util.Arrays;
import java.util.Random;

public class MergeSortLab {

    public static void mergeSort(int[] arr, int left, int right) {
        int mid;

        if (left >= right)
            return;

        mid = (left + right) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        merge(arr, left, mid, right);

        System.out.println("After merge: "
                + Arrays.toString(
                Arrays.copyOfRange(arr, left, right + 1)));
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int[] temp;
        int i;
        int j;
        int k;

        temp = new int[right - left + 1];

        i = left;
        j = mid + 1;
        k = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (i = 0; i < temp.length; i++)
            arr[left + i] = temp[i];
    }

    public static int[] generateArray(int size) {
        Random random;
        int[] arr;
        int i;

        random = new Random();
        arr = new int[size];

        for (i = 0; i < size; i++)
            arr[i] = random.nextInt(100);

        return arr;
    }

    public static void testArray(int size) {
        int[] arr;

        arr = generateArray(size);

        System.out.println("\nOriginal Array (" + size + " elements):");
        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        testArray(7);
        testArray(10);
        testArray(15);
    }
}