package Ex06;

public class InverterArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] invertedArray = new int[originalArray.length];

        // Invert the array
        for (int i = 0; i < originalArray.length; i++) {
            invertedArray[i] = originalArray[originalArray.length - 1 - i];
        }

        // Print the inverted array
        System.out.print("Inverted Array: ");
        for (int num : invertedArray) {
            System.out.print(num + " ");
        }
    }
}
