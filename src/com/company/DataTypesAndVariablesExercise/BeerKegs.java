package com.company.DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersOfBeerKegs = Integer.parseInt(scanner.nextLine());
        double biggestKeg = 0;
        String kegName = "";
        for (int i = 0; i < numbersOfBeerKegs; i++) {
            String modelOfTheKeg = scanner.nextLine();
            double radiusOfTheKeg = Double.parseDouble(scanner.nextLine());
            double heightOfTheKeg = Double.parseDouble(scanner.nextLine());

            double volume = Math.PI * radiusOfTheKeg * radiusOfTheKeg * heightOfTheKeg;
            if (volume > biggestKeg) {
                biggestKeg = volume;
                kegName = modelOfTheKeg;
            }
        }
        System.out.println(kegName);
    }
}

