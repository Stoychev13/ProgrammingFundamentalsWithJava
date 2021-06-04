package com.company.ArraysLab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] number = new int[n];

        for (int i = 0; i < number.length; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            number[i] = num;
        }
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i] + " ");
        }
    }
}
