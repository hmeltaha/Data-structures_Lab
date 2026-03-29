import java.util.Scanner;

public class ArrayTasks {

    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    // Task 1
    public static void task1() {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Task 1: Using for loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Using enhanced for loop");
        for (int num : arr) {
            System.out.println(num);
        }
    }

    // Task 2
    public static void task2() {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Task 2: Enter 5 integers");

        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Elements in order:");
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Elements in reverse:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    // Task 3
    public static void task3() {

        int[] arr = {2, 4, 6, 8, 10};

        arr[2] = 99;

        System.out.println("Task 3: Updated array");

        for (int num : arr) {
            System.out.println(num);
        }
    }

    // Task 4
    public static void task4() {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Task 4: Enter 10 integers");

        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter number to search:");
        int key = input.nextInt();

        boolean found = false;

        for (int i = 0; i < 10; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }

    // Task 5
    public static void task5() {

        int[] arr = {5, 10, 15, 20};
        int element = 25;
        int index = 2;

        int[] newArr = new int[arr.length + 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        newArr[index] = element;

        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        System.out.println("Task 5: Array after insertion");

        for (int num : newArr) {
            System.out.println(num);
        }
    }

    // Task 6
    public static void task6() {

        int[] arr = {11, 22, 33, 44, 55};
        int index = 1;

        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        for (int i = index + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }

        System.out.println("Task 6: Array after deletion");

        for (int num : newArr) {
            System.out.println(num);
        }
    }
}