package com.company.MethodsExercise;

import java.util.Scanner;

public class factorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNUmber = Double.parseDouble(scanner.nextLine());
        double secondNUmber = Double.parseDouble(scanner.nextLine());
        double result = division(firstNUmber, secondNUmber);
        System.out.printf("%.2f", result);
    }

    public static double division(double num1, double num2) {
        double firstFactorial = findFactorial(num1);
        double secondFactorial = findFactorial(num2);
        double result = firstFactorial / secondFactorial;
        return result;
    }

    public static double findFactorial(double number) {
        double result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
