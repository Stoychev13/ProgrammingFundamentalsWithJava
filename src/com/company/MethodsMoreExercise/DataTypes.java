package com.company.MethodsMoreExercise;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfVar = scanner.nextLine();

        if (nameOfVar.equals("int")) {
            int number = Integer.parseInt(scanner.nextLine());
            getInt(number);
        } else if (nameOfVar.equals("real")) {
            double number = Double.parseDouble(scanner.nextLine());
            getReal(number);
        } else {
            String result = scanner.nextLine();
            getString(result);
        }


    }

    private static void getInt(int a) {
        System.out.println(a * 2);
    }

    private static void getReal(double num) {
        System.out.printf("%.2f", num * 1.5);
    }

    private static void getString(String result) {
        System.out.printf("$%s$", result);
    }
}
