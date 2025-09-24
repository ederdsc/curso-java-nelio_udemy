import java.util.Scanner;

public class ExercicioSomaVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        double soma = 0;
        double avg = soma / numeros.length;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.print("VALORES: ");

        for (int i = 0; i < n; i++) {
            System.out.print(" " + numeros[i]);
        }
        System.out.println();
        System.out.println("SOMA: " + soma);

        System.out.println("MEDIA: " + avg);

        sc.close();
    }
}
