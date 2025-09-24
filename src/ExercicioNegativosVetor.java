import java.util.Scanner;

public class ExercicioNegativosVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("digite um numero ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS");

        for (int i = 0; i < n; i++) {
           if (numeros[i] < 0){
               System.out.println(numeros[i]);
           }
        }
    }
}
