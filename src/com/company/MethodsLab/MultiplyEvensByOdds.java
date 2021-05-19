package com.company.MethodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Math.abs(Integer.parseInt(scanner.nextLine()));

        System.out.println(getMultipleOfEvensAndOdds(numbers));
    }

    private static int getEvenSum(int n) {
        int evenSum = 0;

        while (n != 0) {
            int nextNum = n % 10;

            if (nextNum % 2 == 0) {
                evenSum += nextNum;
            }
            n -= nextNum;
            n /= 10;
        }

        return evenSum;
    }

    private static int getOddSum(int n) {
        int oddSum = 0;

        while (n != 0) {
            int nextNum = n % 10;

            if (nextNum % 2 != 0) {
                oddSum += nextNum;
            }
            n -= nextNum;
            n /= 10;
        }
        return oddSum;
    }

    private static int getMultipleOfEvensAndOdds(int n) {
        int evenSum = getEvenSum(n);
        int oddSum = getOddSum(n);

        return evenSum * oddSum;
    }
}

