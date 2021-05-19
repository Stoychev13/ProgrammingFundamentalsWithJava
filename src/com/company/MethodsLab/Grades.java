package com.company.MethodsLab;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        toGrades(num);

    }

    private static void toGrades(double num) {
        if (num >= 2.00 && num <= 2.99) {
            System.out.println("Fail");
        } else if (num >= 3.00 && num <= 3.49) {
            System.out.println("Poor");
        } else if (num >= 3.50 && num <= 4.49) {
            System.out.println("Good");
        } else if (num >= 4.50 && num <= 5.49) {
            System.out.println("Very good");
        } else if (num >= 5.50 && num <= 6) {
            System.out.println("Excellent");
        }
    }
}
