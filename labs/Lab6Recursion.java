public class Lab6Recursion {

    // Task 1: Factorial using recursion
    public static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case
        }
        return n * factorialRecursive(n - 1); // recursive case
    }

    // Task 2: Fibonacci using recursion
    public static int fibonacciRecursive(int n) {
        if (n == 0) {
            return 0; // base case
        }
        if (n == 1) {
            return 1; // base case
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2); // recursive case
    }

    // Task 3: Sum of first n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1; // base case
        }
        return n + sumRecursive(n - 1); // recursive case
    }

    // Task 4: Iterative factorial for comparison
    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Factorial Recursive: " + factorialRecursive(n));
        System.out.println("Factorial Iterative: " + factorialIterative(n));

        System.out.println("Fibonacci Recursive: " + fibonacciRecursive(n));

        System.out.println("Sum Recursive: " + sumRecursive(n));
    }
}