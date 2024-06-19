
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Add the operation
        System.out.print("Enter the operation (+, -, *, /): ");
        String operation = scanner.next();

        // Input the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform the calculation based on the operation
        double result;
        switch (operation) {
            // Switch is used to perform the various conditions the operation variable
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                // Handle division by zero
                if (num2 == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operation entered.");
                return;
                // return sends the value back to the place where the method was 
        }
        // Display the result
        System.out.println("The result is: " + result);

        scanner.close();
    }
}
