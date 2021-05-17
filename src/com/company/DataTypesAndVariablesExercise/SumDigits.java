package com.company.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        int secondSum = n;

        while (secondSum > 0) {
            sum = sum + (secondSum % 10);
            secondSum = secondSum / 10;
        }

        System.out.println(sum);

    }
}
