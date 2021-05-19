package com.company.MethodsExercise;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = readInteger(scanner);
        int b = readInteger(scanner);
        int c = readInteger(scanner);

        int minNUmber = findMinNumber(a, b, c);
        System.out.println(minNUmber);
    }

    public static int readInteger(Scanner scanner) {
        int num = scanner.nextInt();
        return num;
    }

    public static int findMinNumber(int first, int second, int third) {
        if (first < second && first < third) {
            return first;
        } else if (second < first && second < third) {
            return second;
        } else {
            return third;
        }
    }
}
