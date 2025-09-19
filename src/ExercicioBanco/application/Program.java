package ExercicioBanco.application;

import ExercicioBanco.entities.Account;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account = new Account();

        System.out.println("Enter account number: ");
        account.setNumber(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter account holder: ");
        account.setHolder(sc.nextLine());

        System.out.println("Is there na initial deposit (y/n)? ");
        String initialDeposit = sc.next();

        if (initialDeposit.equalsIgnoreCase("y")) {
            System.out.println("Enter initial deposit value: ");
            account.setBalance(sc.nextDouble());
        } else {
            System.out.println(account);
        }

        System.out.println("Enter a deposit value: ");
        account.deposit(sc.nextDouble());


        System.out.println(account);
        System.out.println(" ");


        System.out.println("Enter a withdraw value: ");
        account.withdraw(sc.nextDouble());

        System.out.println(account);
        sc.close();
    }
}
