import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idade;
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();

        System.out.println("sua idade é: " + idade);

        sc.close();
    }
}