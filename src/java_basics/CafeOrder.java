package java_basics;

import java.text.DecimalFormat;


public class CafeOrder {

    public static void main(String[] args) {

        double coffee = 3.25;
        double cappuccino = 4.75;
        double espresso = 2.50;

        double subtotal = (3 * coffee) + (4 * cappuccino) + (2 * espresso);

        final double SALES_TAX = 0.07;

        double totalSale = subtotal + (subtotal * SALES_TAX);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Subtotal: $" + df.format(subtotal));
        System.out.println("Total Sale: $" + df.format(totalSale));
    }

}
