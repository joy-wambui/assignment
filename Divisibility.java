import java.util.Scanner;  // Import for Scanner class

public class Divisibility {

    public static void main(String[] args) {
        int number;

        // Get input from the user
        System.out.print("Enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        // Check divisibility for each digit (0-9)
        for (int divisor = 0; divisor <= 9; divisor++) {
            if (isDivisible(number, divisor)) {
                explainDivisibility(number, divisor);
            }
        }
        scanner.close();  // Close the scanner to avoid resource leaks
    }

    // Function to check divisibility
    public static boolean isDivisible(int num, int divisor) {
        if (divisor == 0) {  // Special case: 0 is not divisible by any number
            return false;
        }
        return num % divisor == 0;
    }

    // Function to explain divisibility based on the divisor
    public static void explainDivisibility(int num, int divisor) {
        switch (divisor) {
            // switch is preferred because a set of conditions are based on the variable divisor
            case 0:
                // This case won't be reached due to the check is not Divisible
                break;
            case 1:
                System.out.println(num + " is divisible by " + divisor + " because all numbers are divisible by 1.");
                break;
            case 2:
                if (num % 2 == 0) {
                    System.out.println(num + " is divisible by " + divisor + " because it ends with an even digit (0, 2, 4, 6, or 8).");
                }
                break;
            case 3:
                int sumOfDigits = 0;
                while (num > 0) {
                    sumOfDigits += num % 10;
                    num /= 10;
                }
                if (sumOfDigits % 3 == 0) {
                    System.out.println(num + " is divisible by " + divisor + " because the sum of its digits (" + sumOfDigits + ") is divisible by 3.");
                }
                break;
            case 4:
                if (num % 100 == 0 || num % 100 == 4) {
                    System.out.println(num + " is divisible by " + divisor + " because the last two digits form a number divisible by 4 (like 00, 04, 16, etc.).");
                }
                break;
            case 5:
                if (num % 5 == 0) {
                    System.out.println(num + " is divisible by " + divisor + " because it ends with a 0 or a 5.");
                }
                break;
            case 6:
                if (isDivisible(num, 2) && isDivisible(num, 3)) {
                    System.out.println(num + " is divisible by " + divisor + " because it's divisible by both 2 and 3.");
                }
                break;
            case 7:
                // There's no simple divisibility rule for 7. We can explain a more complex method if needed.
                break;
            case 8:
                if (num % 1000 == 0) {  // Changed to check last 3 digits for divisibility by 8
                    System.out.println(num + " is divisible by " + divisor + " because the last three digits form a number divisible by 8 (like 000, 008, 160, etc.).");
                }
                break;
                case 9:
                int sumOfDigits9 = (num);
                System.out.println(num + " is divisible by " + divisor + " because the sum of its digits (" + sumOfDigits9 + ") is divisible by 9.");
                break;
        }
    }
}
