package com.company.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int endSum = 0;

        for (int i = firstNum; i <= secondNum; i++) {

            System.out.printf("%d ", i);
            endSum += i;
        }

        System.out.println();
        System.out.printf("Sum: %d", endSum);


    }
}
