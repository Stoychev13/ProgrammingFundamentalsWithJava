package com.company.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsNumber = Integer.parseInt(scanner.nextLine());
        double priceLightSabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        double additionalLightSabers = Math.ceil(0.10 * studentsNumber);

        double totalLightSabers = (studentsNumber + additionalLightSabers) * priceLightSabers;
        double totalRobes = priceRobes * studentsNumber;

        double freeBelts = Math.floor(studentsNumber / 6.00);
        double totalBelts = priceBelts * (studentsNumber - freeBelts);

        double moneyNeeded = totalBelts + totalLightSabers + totalRobes;
        if (budget >= moneyNeeded) {

            System.out.printf("The money is enough - it would cost %.2flv.", moneyNeeded);
        } else {
            double moneyDiff = moneyNeeded - budget;
            System.out.printf("George Lucas will need %.2flv more.", moneyDiff);
        }

    }
}
