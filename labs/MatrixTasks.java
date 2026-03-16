import java.util.Scanner;

public class MatrixTasks {

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

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Task 1: Matrix in tabular form");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Task 2
    public static void task2() {

        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Task 2: Enter 3x3 matrix values");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Row major order:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        System.out.println("\nColumn major order:");

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        System.out.println();
    }

    // Task 3
    public static void task3() {

        int[][] matrix = {
            {5, 6, 7},
            {8, 9, 10},
            {11, 12, 13}
        };

        matrix[1][2] = 99;

        System.out.println("Task 3: Updated Matrix");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Task 4
    public static void task4() {

        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[4][4];

        System.out.println("Task 4: Enter 4x4 matrix");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter number to search:");
        int key = input.nextInt();

        boolean found = false;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Element found at position (" + i + "," + j + ")");
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }

    // Task 5
    public static void task5() {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Task 5: Row sums");

        for (int i = 0; i < 3; i++) {

            int sum = 0;

            for (int j = 0; j < 3; j++) {
                sum += matrix[i][j];
            }

            System.out.println("Row " + i + " sum = " + sum);
        }

        System.out.println("Column sums");

        for (int j = 0; j < 3; j++) {

            int sum = 0;

            for (int i = 0; i < 3; i++) {
                sum += matrix[i][j];
            }

            System.out.println("Column " + j + " sum = " + sum);
        }
    }

    // Task 6
    public static void task6() {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Task 6: Main diagonal");

        for (int i = 0; i < 3; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println("\nSecondary diagonal");

        for (int i = 0; i < 3; i++) {
            System.out.print(matrix[i][2 - i] + " ");
        }

        System.out.println();
    }

}