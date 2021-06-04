package com.company.ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] number = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(element -> Integer.parseInt(element))
                .toArray();

        int evenNumbers = 0;

        for (int num : number) {
            if (num % 2 == 0) {
                evenNumbers += num;
            }
        }

        System.out.println(evenNumbers);

    }
}
