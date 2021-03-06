package com.company.DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double eps = 0.000001;
        double n1 = 0.0;
        double n2 = 0.0;

        while (true) {
            n1 = Double.parseDouble(scanner.nextLine());
            n2 = Double.parseDouble(scanner.nextLine());
            boolean flag = Math.abs(n1 - n2) < eps;

            if (flag) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
            break;
        }
    }
}
