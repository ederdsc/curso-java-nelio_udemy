package application;

import entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Products products = new Products();

        int quantity = 0;

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        products.name = sc.nextLine();
        System.out.println("Price: ");
        products.price = sc.nextDouble();
        System.out.println("Quantity int stock: ");
        products.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product data: " + products);

        System.out.println("Deseja adicionar mais produtos? Digite 1 para sim ou 2 para não");
        int option = sc.nextInt();

        if (option == 1) {

            System.out.println();
            System.out.println("Enter the number of products to be added in stock: ");
            quantity = sc.nextInt();
            products.addProducts(quantity);

            System.out.println();
            System.out.println("Updated data: " + products);
        }

        System.out.println();
        System.out.println("Deseja remover algum produto? Digite 1 para sim ou 2 para não");
        option = sc.nextInt();

        if (option == 1) {
            System.out.println();
            System.out.println("Enter the number of products to be removed from stock: ");
            quantity = sc.nextInt();
            products.removeProducts(quantity);

        }

        System.out.println();
        System.out.println("Updated data: " + products);

        sc.close();

    }
}
