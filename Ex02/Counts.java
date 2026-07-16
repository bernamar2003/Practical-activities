package Ex02;

           import java.util.Scanner;

public class Counts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine().toLowerCase();

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if ("aeiouáéíóúâêôàãõü".indexOf(c) >= 0) {
                contador++;
            }
        }

        System.out.println("Número de vogais: " + contador);
        scanner.close();
    }
}
