package ExercicioEstoque.application;

import ExercicioEstoque.entities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantity = 0;

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();
//        System.out.println("Quantity int stock: ");
//        quantity = sc.nextInt();

        Products products = new Products(name, price, quantity);

        products.setName("computer");
        System.out.println(products.getName());
        products.setPrice(1200);
        System.out.println(products.getPrice());

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
