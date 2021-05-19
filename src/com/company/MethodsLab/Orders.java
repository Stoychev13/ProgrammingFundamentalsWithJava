package com.company.MethodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int numOfProducts = Integer.parseInt(scanner.nextLine());

        switch (product) {
            case "coffee":
                coffeePrice(numOfProducts);
                break;
            case "water":
                waterPrice(numOfProducts);
                break;
            case "coke":
                cokePrice(numOfProducts);
                break;
            case "snacks":
                snacksPrice(numOfProducts);
                break;
        }

    }

    private static void coffeePrice(double num) {
        num *= 1.50;
        System.out.printf("%.2f", num);
    }

    private static void waterPrice(double num) {
        num *= 1.00;
        System.out.printf("%.2f", num);
    }

    private static void cokePrice(double num) {
        num *= 1.40;
        System.out.printf("%.2f", num);
    }

    private static void snacksPrice(double num) {
        num *= 2.00;
        System.out.printf("%.2f", num);

    }
}
