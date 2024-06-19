import java.util.Scanner;

public class SurnameChe {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Provides user with methods to input
        
        // Enter your surname
        System.out.println("Enter your surname: ");
        String surname = scanner.nextLine();

        // Enter your current age
        System.out.println("Enter your current age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Reads and inputs entire line of text and stores it in name the variable

        // Calculate the length of the surname
        int surnameLength = surname.length();

        // Check if age is even using modulo to find remainder and store result
        String evenOrOdd = (age % 2 == 0) ? "even" : "odd";

        // Print the number of characters in the surname
        System.out.println("The number of characters in your surname is " + surnameLength + ".");

        // Print a message indicating if age is even or odd
        System.out.println("Your current age is an " + evenOrOdd + " number.");

        // Close the Scanner object to release output
        scanner.close();
    }
}
