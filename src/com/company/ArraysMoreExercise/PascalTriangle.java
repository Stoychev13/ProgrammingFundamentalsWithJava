package com.company.ArraysMoreExercise;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        int r = scanner.nextInt();

        for (int i = 0; i < r; i++) {
            number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }
}
