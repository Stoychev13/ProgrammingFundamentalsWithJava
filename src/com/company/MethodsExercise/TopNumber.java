package com.company.MethodsExercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= n; i++) {
            if (isTopNUmber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isTopNUmber(int number) {
        int sum = 0;
        boolean hasOddDigits = false;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number = number / 10;
            if (digit % 2 != 0) {
                hasOddDigits = true;
            }
        }
        if (sum % 8 == 0 && hasOddDigits) {
            return true;
        }
        return false;

    }
}
