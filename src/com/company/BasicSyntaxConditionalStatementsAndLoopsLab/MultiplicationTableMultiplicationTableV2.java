package com.company.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class MultiplicationTableMultiplicationTableV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int times = Integer.parseInt(scanner.nextLine());

        int endSum = 0;

        for (int j = times; j <= 10; j++) {

            endSum = n * j;
            System.out.printf("%d X %d = %d\n", n, j, endSum);

        }
        if (times > 10) {
            endSum = n * times;
            System.out.printf("%d X %d = %d\n", n, times, endSum);
        }
    }
}
