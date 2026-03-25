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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // --- Task 1 ---
        System.out.println("=== Task 1: Print Digits ===");
        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();
        printDigits(num1);

        // --- Task 2 ---
        System.out.println("\n=== Task 2: Average of Elements ===");
        System.out.print("Enter count of elements: ");
        int n2 = sc.nextInt();
        int[] arr = new int[n2];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n2; i++) arr[i] = sc.nextInt();
        int sum = sumArray(arr, 0);
        double avg = (double) sum / n2;
        System.out.println("Average: " + avg);

        // --- Task 3 ---
        System.out.println("\n=== Task 3: Prime Number Check ===");
        System.out.print("Enter a number: ");
        int num3 = sc.nextInt();
        System.out.println(isPrime(num3, 2) ? "Prime" : "Composite");

        // --- Task 4 ---
        System.out.println("\n=== Task 4: Factorial ===");
        System.out.print("Enter n: ");
        int num4 = sc.nextInt();
        System.out.println(num4 + "! = " + factorial(num4));

        // --- Task 5 ---
        System.out.println("\n=== Task 5: Fibonacci ===");
        System.out.print("Enter n: ");
        int num5 = sc.nextInt();
        System.out.println("F(" + num5 + ") = " + fibonacci(num5));

        // --- Task 6 ---
        System.out.println("\n=== Task 6: Power ===");
        System.out.print("Enter a and n: ");
        long a6 = sc.nextLong();
        int n6 = sc.nextInt();
        System.out.println(a6 + "^" + n6 + " = " + power(a6, n6));

        // --- Task 7 ---
        System.out.println("\n=== Task 7: Reverse Output ===");
        System.out.print("Enter count of numbers: ");
        int n7 = sc.nextInt();
        int[] arr7 = new int[n7];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < n7; i++) arr7[i] = sc.nextInt();
        reverseOutput(arr7, n7 - 1);
        System.out.println();

        // --- Task 8 ---
        System.out.println("\n=== Task 8: Check Digits in String ===");
        System.out.print("Enter a string: ");
        sc.nextLine(); // consume leftover newline from previous nextInt/nextLong
        String s8 = sc.nextLine().trim();
        System.out.println(isAllDigits(s8, 0) ? "Yes" : "No");

        // --- Task 9 ---
        System.out.println("\n=== Task 9: Count Characters ===");
        System.out.print("Enter a string: ");
        String s9 = sc.nextLine().trim();
        System.out.println("Length: " + countChars(s9, 0));

        // --- Task 10 ---
        System.out.println("\n=== Task 10: GCD ===");
        System.out.print("Enter two numbers: ");
        int a10 = sc.nextInt();
        int b10 = sc.nextInt();
        System.out.println("GCD(" + a10 + ", " + b10 + ") = " + gcd(a10, b10));

        sc.close();
    }
}
