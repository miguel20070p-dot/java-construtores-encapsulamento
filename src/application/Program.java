package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product("TV", 900.0, 10);
        Product p2 = new Product("Notebook", 1200.0);
        Product p3 = new Product();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        sc.close();
    }
}
