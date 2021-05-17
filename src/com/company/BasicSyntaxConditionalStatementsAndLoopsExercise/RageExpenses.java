package com.company.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int counter = 0;
        int headsetCounter = 0;
        int mouseCounter = 0;
        int keyboardCounter = 0;
        int displayCounter = 0;
        double totalPrice = 0;

        for (int i = 0; i <= lostGames; i++) {
            if (counter % 2 == 0 && counter != 0) {
                headsetCounter++;
                totalPrice += headsetPrice;
            }
            if (counter % 3 == 0 && counter != 0) {
                mouseCounter++;
                totalPrice += mousePrice;
            }
            if (counter % 6 == 0 && counter != 0) {
                keyboardCounter++;
                totalPrice += keyboardPrice;

                if (counter % 12 == 0) {
                    displayCounter++;
                    totalPrice += displayPrice;
                }
            }
            counter++;
        }

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);

    }
}
