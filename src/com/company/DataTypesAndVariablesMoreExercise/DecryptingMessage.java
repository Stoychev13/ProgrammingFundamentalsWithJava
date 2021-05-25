package com.company.DataTypesAndVariablesMoreExercise;

import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int lines = Integer.parseInt(scanner.nextLine());

        String sumMessage = "";

        for (int i = 0; i < lines; i++) {
            String c = scanner.nextLine();
            char input = c.charAt(0);
            int value = input + key;

            char message = (char) value;

            sumMessage += message;
        }
        System.out.println(sumMessage);
    }
}

