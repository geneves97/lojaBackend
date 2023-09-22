package application;

import entities.ProductEntity;

import java.util.Locale;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Program
{
    public static void main( String[] args ) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner((System.in));

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();

        ProductEntity productEntity = new ProductEntity(name, price, quantity);

        System.out.println();
        System.out.println("Producrt data: " + productEntity);

        System.out.println();
        System.out.println("Enter the number of products to be addeded to stock: ");

        quantity = sc.nextInt();
        productEntity.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + productEntity);

        System.out.println();
        System.out.println("Enter the number of products to be removed to stock: ");

        quantity = sc.nextInt();
        productEntity.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + productEntity);

        sc.close();
    }
}
