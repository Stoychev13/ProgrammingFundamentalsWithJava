package com.company.DataTypesAndVariablesLab;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstSymbol = scanner.nextLine();
        String secondSymbol = scanner.nextLine();
        String thirdSymbol = scanner.nextLine();

        System.out.printf("%s%s%s", firstSymbol, secondSymbol, thirdSymbol);

    }
}
