import java.util.Scanner;

public class ExercicioNumParesVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        int numerosPares[] = new int[n];

        System.out.println("NUMEROS PARES: ");
        int quantity = 0;
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                numerosPares[i] = numeros[i];
                System.out.print(numerosPares[i] + " ");
                quantity++;
            }
        }

        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + quantity);

        sc.close();
    }
}
