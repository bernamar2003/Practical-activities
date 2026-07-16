package Ex04;
        import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        System.out.print("Enter a year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            } else {
                System.out.println(year + " is a leap year.");
            }
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
