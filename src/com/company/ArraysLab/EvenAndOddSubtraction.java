package com.company.ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;
        int endSum = 0;

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element))
                .toArray();


        for (int num : numbers) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        endSum = evenSum - oddSum;
        System.out.println(endSum);
    }
}
