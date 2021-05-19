package com.company.ArraysExercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArr = scanner.nextLine().split(" ");
        String[] secondArr = scanner.nextLine().split(" ");

        for (String secElement : secondArr) {
            for (String firstElement : firstArr) {
                if (secElement.equals(firstElement)) {
                    System.out.print(firstElement + " ");
                }
            }
        }
    }
}
