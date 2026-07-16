        import java.util.Scanner;
    public class FirstEx{
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String inverted = new StringBuilder(text).reverse().toString();

        System.out.println("Inverted String: " + inverted);

        scanner.close();
    }
}
