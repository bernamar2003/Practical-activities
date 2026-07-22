/*This example shows how to use a do-while loop to create a simple menu-based program. 
The menu is displayed at least once, and the user 
is prompted to make their choice until they decide to exit. 
The switch statement (covered in the previous lesson) 
is used to handle the different menu options. */

package Ex06;
import java.util.Scanner;

public class DoWhileLoopMenuExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // This do-while loop displays a menu and prompts the user for their choice until they choose to exit.
        do {
            System.out.println("Menu:");
            System.out.println("1. Option 1");
            System.out.println("2. Option 2");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You chose Option 1.");
                    break;
                case 2:
                    System.out.println("You chose Option 2.");
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 3);

        scanner.close();
    }
}