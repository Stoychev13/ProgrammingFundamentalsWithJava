package com.company.MethodsMoreExercise;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNumber = Double.parseDouble(scanner.nextLine());
        double secondNumber = Double.parseDouble(scanner.nextLine());
        double thirdNumber = Double.parseDouble(scanner.nextLine());

        isPositive(firstNumber, secondNumber, thirdNumber);

    }

    private static void isPositive(double num1, double num2, double num3) {

        if (num1 == 0 || num2 == 0 || num3 == 0) {
            System.out.println("zero");
        } else if ((num1 > 0 && num2 > 0 && num3 > 0) || (num1 < 0 && num2 < 0 && num3 > 0) || (num1 < 0 && num2 > 0 && num3 < 0) || (num1 > 0 && num2 < 0 && num3 < 0)) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}
