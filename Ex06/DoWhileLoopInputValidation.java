package Ex06;

import java.util.Scanner;

public class DoWhileLoopInputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        // This do-while loop ensures that the user enters a valid age (between 0 and 120).
        do {
            System.out.print("Enter your age (0-120): ");
            age = scanner.nextInt();

            if (age < 0 || age > 120) {
                System.out.println("Invalid age. Please enter a value between 0 and 120.");
            }
        } while (age < 0 || age > 120);

        System.out.println("You entered a valid age: " + age);
        scanner.close();
    }
}