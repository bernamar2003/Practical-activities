package Ex06;

public class EncontreMaiorElemento {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25};

        // Inicializa a variável 'maior' com o primeiro elemento do array
        int maior = numeros[0];

        // Loop para encontrar o maior elemento
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior elemento do array é: " + maior);
    }
}
