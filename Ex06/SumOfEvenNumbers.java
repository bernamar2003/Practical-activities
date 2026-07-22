package Ex06;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;

        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                sum += i; // Add even number to sum
            }
        }

        System.out.println("The sum of even numbers from 1 to 100 is: " + sum);
    }   
}
