package com.company.MethodsLab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.printf("%.0f", calculate(firstNum, symbol, secondNum));

    }

    private static double calculate(double a, String operator, double b) {

        double result = 0;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a / b;
                break;
            case "-":
                result = a - b;
                break;
        }

        return result;

    }
}
