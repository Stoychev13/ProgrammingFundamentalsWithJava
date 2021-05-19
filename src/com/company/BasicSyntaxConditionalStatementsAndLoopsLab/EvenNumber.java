package com.company.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 100; i++) {
            int n = Integer.parseInt(scanner.nextLine());

            if (n % 2 != 0) {
                System.out.println("Please write an even number.");
            } else {
                System.out.printf("The number is: %d", Math.abs(n));
                break;
            }
        }
    }
}
