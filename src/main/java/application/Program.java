package application;

import entities.ProductEntity;

import java.util.Locale;
import java.util.Scanner;

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
        ProductEntity productEntity = new ProductEntity(name, price);

        productEntity.setName("Computer");
        System.out.println("Updated name: " + productEntity.getName());
        productEntity.setPrice(900);
        System.out.println("Updated price: " + productEntity.getPrice());
        System.out.println("Quantity: " + productEntity.getQuantity());

        System.out.println();
        System.out.println("Producrt data: " + productEntity);
        System.out.println();
        System.out.println("Enter the number of products to be addeded to stock: ");
        int quantity = sc.nextInt();
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
