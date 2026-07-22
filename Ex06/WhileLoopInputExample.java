package Ex06;
    import java.util.Scanner;

public class WhileLoopInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        // This while loop continues as long as the user does not enter -1.
        while (number != -1) {
            System.out.print("Enter a number (-1 to quit): ");
            number = scanner.nextInt();

            if (number != -1) {
                System.out.println("You entered: " + number);
            }
        }

        System.out.println("Exiting...");
        scanner.close();
    }
}

