package ExercicioListasEmployee.application;

import ExercicioListasEmployee.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Employee> list = new ArrayList<>();


        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Employee #" + (i + 1) + ":");
            System.out.println("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
        }


        System.out.println("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt();
        Employee test = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if (test == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            test.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee list1 : list){
            System.out.println(list1);
        }


        sc.close();
    }
}
