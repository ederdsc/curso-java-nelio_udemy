package application;

import entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioProgramExercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Nome: ");
        funcionario.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        funcionario.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        funcionario.tax = sc.nextDouble();

        System.out.println("Employee: "+ funcionario.name +", $ " + funcionario.netSalary());

        System.out.println("Wich percentage to increase salary? ");
        funcionario.increaseSalary(sc.nextDouble());

        System.out.println("Updated data: " + funcionario.name + ", $ " + funcionario.grossSalary);

        sc.close();
    }
}
