package ExercicioFuncionario.application;

import ExercicioFuncionario.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.println("Nome: ");
        employee.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: "+ employee.name +", $ " + employee.netSalary());

        System.out.println("Wich percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());

        System.out.println("Updated data: " + employee.name + ", $ " + employee.grossSalary);

        sc.close();
    }
}

