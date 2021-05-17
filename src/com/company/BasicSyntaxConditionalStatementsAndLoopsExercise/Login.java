package com.company.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = reverse(username);

        for (int i = 0; i <= 4; i++) {
            String inputPassword = scanner.nextLine();

            if (i == 3) {
                System.out.printf("User %s blocked!", username);
                break;
            }

            if (password.equals(inputPassword)) {
                System.out.printf("User %s logged in.", username);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }
        }
    }

    private static String reverse(String password) {
        if (password == null || password.isEmpty()) {
            return password;
        }
        StringBuilder reverse = new StringBuilder();
        for (int i = password.length() - 1; i >= 0; i--) {
            reverse.append(password.charAt(i));
        }
        return reverse.toString();

    }
}
