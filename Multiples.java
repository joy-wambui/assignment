public class Multiples {
        public static void main(String[] args) {
    
            // Define the starting and ending points of the range
            int start = 71;
            int end = 150;
    
            System.out.println("Multiples of 2, 3 and 7 between " + start + " and " + end + ":");
    
            // Loop through each number in the range
            for (int number = start; number <= end; number++) {
    
                // Check if the number is a multiple of 2, 3 or 7
                if (number % 2 == 0 || number % 3 == 0 || number % 7 == 0) {
                    System.out.print(number + " ");
                    // the logical operator || represents OR
                }
            }
            System.out.println(); // Print a newline after displaying all multiples
        }
    }
    
