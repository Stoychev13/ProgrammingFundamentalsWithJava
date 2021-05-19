package com.company.ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArr = new String[n];
        String[] secondArr = new String[n];

        for (int i = 0; i < n; i++) {
            String[] currentLIne = scanner.nextLine().split(" ");
            if (i % 2 == 0) {
                firstArr[i] = currentLIne[0];
                secondArr[i] = currentLIne[1];
            } else {
                firstArr[i] = currentLIne[1];
                secondArr[i] = currentLIne[0];
            }
        }
        System.out.println(String.join(" ", firstArr));
        System.out.println(String.join(" ", secondArr));

    }
}
