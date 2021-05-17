package com.company.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int group = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        switch (typeGroup) {
            case "Students":
                switch (day) {
                    case "Friday":
                        price = 8.45;
                        break;
                    case "Saturday":
                        price = 9.80;
                        break;
                    case "Sunday":
                        price = 10.46;
                        break;
                }
                break;
            case "Business":
                switch (day) {
                    case "Friday":
                        price = 10.90;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16;
                }
                break;
            case "Regular":
                switch (day) {
                    case "Friday":
                        price = 15;
                        break;
                    case "Saturday":
                        price = 20;
                        break;
                    case "Sunday":
                        price = 22.50;
                        break;
                }
                break;
        }

        double endResult = price * group;
        double discount = 0;

        if (group >= 30 && typeGroup.equals("Students")) {
            discount = endResult * 0.85;
            endResult = discount;
        }
        if (group >= 100 && typeGroup.equals("Business")) {
            discount = endResult * 0.90;
            endResult = discount;
        }
        if (group >= 10 && group <= 20 && typeGroup.equals("Regular")) {
            discount = endResult * 0.95;
            endResult = discount;
        }
        System.out.printf("Total price: %.2f", endResult);

    }
}
