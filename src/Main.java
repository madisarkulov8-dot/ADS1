import java.util.Scanner;

public class Main {

    
    // PART 1. Recursion with Numbers
   

    // Task 1. Print Digits of a Number
    // Prints each digit of the number on a separate line (left to right)
    static void printDigits(int n) {
        if (n < 0) n = -n; // handle negative numbers
        if (n / 10 != 0) {
            printDigits(n / 10);
        }
        System.out.println(n % 10);
    }

    // Task 2. Average of Elements
    // Recursively calculates the sum of array elements
    static int sumArray(int[] arr, int index) {
        if (index == arr.length) return 0;
        return arr[index] + sumArray(arr, index + 1);
    }

    // Task 3. Prime Number Check
    // Checks if n is prime using a recursive divisor check
    static boolean isPrime(int n, int divisor) {
        if (n < 2) return false;
        if (divisor * divisor > n) return true;
        if (n % divisor == 0) return false;
        return isPrime(n, divisor + 1);
    }

    // Task 4. Factorial
    static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    
    // PART 2. Recursion with Sequences
    

    // Task 5. Fibonacci Number
    static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Task 6. Power Function (a^n)
    static long power(long a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    // Task 7. Reverse Output
    // Prints array elements in reverse order using recursion
    static void reverseOutput(int[] arr, int index) {
        if (index < 0) return;
        System.out.print(arr[index] + " ");
        reverseOutput(arr, index - 1);
    }

    
    // PART 3. Recursion with Strings
    

    // Task 8. Check Digits in String
    static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }

    // Task 9. Count Characters in a String
    static int countChars(String s, int index) {
        if (index == s.length()) return 0;
        return 1 + countChars(s, index + 1);
    }

    // Task 10. Greatest Common Divisor (Euclidean Algorithm)
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
