package com.company.ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] firstArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element))
                .toArray();

        int[] secondArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element))
                .toArray();


        int sum = 0;
        boolean areIdentical = true;

        for (int i = 0; i < firstArray.length; i++) {

            sum += firstArray[i];

            if (firstArray[i] != secondArray[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                areIdentical = false;
                break;
            }
        }
        if (areIdentical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }

    }
}
