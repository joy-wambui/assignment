import java.util.Scanner;

public class StudentMarks {

  public static void main(String[] args) {
    // Create a Scanner object to read user input
    Scanner scanner = new Scanner(System.in);

    // Array to store unit names
    String[] unitNames = {
        "Java Programming",
        "Application Programming",
        "Structured Cabling",
        "Networks",
        "HCI"
    };

    // Variables to store total marks and calculate average
    double totalMarks = 0.0;

    // Loop to get marks for each unit and calculate grade
    for (int number = 0; number < unitNames.length; number++) {
      System.out.print("Enter the marks for " + unitNames[number] + ": ");
      double marks = scanner.nextDouble();

      // Calculate grade for the current unit 
      String grade;
      if (marks >= 70 && marks <= 100) {
        grade = "A";
      } else if (marks >= 60) {
        grade = "B";
      } else if (marks >= 50) {
        grade = "C";
      } else if (marks >= 40) {
        grade = "D";
      } else {
        grade = "Fail";
      }

      // Add current marks to total for average calculation
      totalMarks += marks;

      // Display grade for the current unit
      System.out.println("The grade for " + unitNames[number] + " is: " + grade);
    }

    // Calculate and display the average score in two decimal places
    double averageScore = totalMarks / unitNames.length;
    System.out.printf("The average score for all units is: %.2f\n", averageScore);

    // Close the Scanner object to avoid resource leaks
    scanner.close();
  }
}
