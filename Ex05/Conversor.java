import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota (0 a 100): ");
        int nota = scanner.nextInt();

        switch (nota / 10) {
            case 10: // Nota 100
            case 9:  // Notas 90-99
                System.out.println("Nota por letra: A");
                break;

            case 8:  // Notas 80-89
                System.out.println("Nota por letra: B");
                break;

            case 7:  // Notas 70-79
                System.out.println("Nota por letra: C");
                break;

            case 6:  // Notas 60-69
                System.out.println("Nota por letra: D");
                break;

            case 5:  // Notas 50-59
            case 4:  // Notas 40-49
            case 3:  // Notas 30-39
            case 2:  // Notas 20-29
            case 1:  // Notas 10-19
            case 0:  // Notas 0-9
                System.out.println("Nota por letra: F");
                break;

            default:
                System.out.println("Entrada inválida! A nota deve estar entre 0 e 100.");
        }

        scanner.close();
    }
}
