package com.company.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int endSum = 0;

        for (int i = 1; i <= 10; i++) {

            endSum = i * n;
            System.out.printf("%d X %d = %d\n", n, i, endSum);

        }
    }
}
