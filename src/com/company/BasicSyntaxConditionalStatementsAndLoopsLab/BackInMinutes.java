package com.company.BasicSyntaxConditionalStatementsAndLoopsLab;

import java.util.Scanner;

public class BackInMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int sumTime = hours * 60 + min + 30;

        hours = sumTime / 60;
        min = sumTime % 60;

        if (hours > 23) {
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, min);

    }
}
